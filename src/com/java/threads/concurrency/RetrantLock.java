package com.java.threads.concurrency;

import java.util.concurrent.locks.ReentrantLock;

public class RetrantLock {

	private static ReentrantLock lock=new ReentrantLock(true);//true flag for fairness
	private static int seat=100;
	private void bookSeat() {
		if(seat>0) {
			lock.lock();
			try {
			System.out.println("Your Seat Is--"+seat--);
			}finally {
				lock.unlock();
			}
		}else {
			System.out.println("Seat not available due to all seat are booked");
		}
		
		
	}
	
	
	
	
	public static void main(String[] args) {
     RetrantLock obj=new RetrantLock();
     new Thread(()->obj.bookSeat()).start();
     new Thread(()->obj.bookSeat()).start();
     new Thread(()->obj.bookSeat()).start();
     new Thread(()->obj.bookSeat()).start();
		
	}

}
