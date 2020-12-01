package com.java.threads.concurrency;


public class ConcurrencySyncronized {

	private int count_seat=100;
	
	private int bookSeat() {
		synchronized (this) {
			if(count_seat>0) {
				return count_seat--;
				
			}else {
				System.out.println("Seat not available");
				return 0;
			}
		}
	}

   	private   int bookWith() {
		if(count_seat>0) {
			return count_seat--;
		}else {
			System.out.println("Seat not availabel");
			return 0;
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
      ConcurrencySyncronized obj=new ConcurrencySyncronized();
		new Thread(()->{
			int value=obj.bookSeat();
		    System.out.println(value);
		}).start();
		new Thread(()->{
			int value=obj.bookSeat();
		    System.out.println(value);
		}).start();
		new Thread(()->{
			int value=obj.bookSeat();
		    System.out.println(value);
		}).start();
		
		
		System.out.println("================================");
		ConcurrencySyncronized obj1=new ConcurrencySyncronized();
		Thread.sleep(2000);
		new Thread(()->{
			int value=obj1.bookWith();
		    System.out.println(value);
		    try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}).start();
		
		new Thread(()->{
			int value=obj1.bookWith();
		    System.out.println(value);
		}).start();

		new Thread(()->{
			int value=obj1.bookWith();
		    System.out.println(value);
		}).start();
		


	}
   
	
	
}
