package com.java.threads.concurrency;

import java.util.concurrent.locks.ReentrantReadWriteLock;


public class ReadWriteReetrantLock {

	private static int seat=100;
	private ReentrantReadWriteLock lock=new ReentrantReadWriteLock(); 
	private ReentrantReadWriteLock.ReadLock readlock=lock.readLock();
	private ReentrantReadWriteLock.WriteLock writelock=lock.writeLock();
	private void bookseat() {
		if(seat>0) {
			writelock.lock();
			System.out.println("Your Seat Number is--"+seat--);
			writelock.unlock();
		}else {
			System.out.println("Seat not available");
		}
		
	}
	
	private void getCountSeat() {
		readlock.lock();
		System.out.println("TotalSeat--"+seat);
		readlock.unlock();
		
	}
	public static void main(String[] args) {
      ReadWriteReetrantLock obj=new ReadWriteReetrantLock();
      new Thread(()->obj.bookseat()).start();
      new Thread(()->obj.bookseat()).start();
      new Thread(()->obj.getCountSeat()).start();    
      new Thread(()->obj.bookseat()).start();
      new Thread(()->obj.getCountSeat()).start();
      new Thread(()->obj.bookseat()).start();
      new Thread(()->obj.getCountSeat()).start();
	}

}
