package com.java.threads.concurrency;

import java.util.concurrent.CountDownLatch;


public class CountDown {

	public static void main(String[] args) throws InterruptedException {
    CountDownLatch latch=new CountDownLatch(2);
    System.out.println("Main Thread Started=================");
    new Thread(()-> {
    	try {
    		System.out.println("Thread 1 is running");
    	  Thread.sleep(1000);
    	  latch.countDown();
    	  
    	  }catch (Exception e) {
    		  System.out.println(e.getMessage());
		}
    }).start();
    
    
    new Thread(()-> {
    	try {
    		System.out.println("Thread 2 is running");
    	  Thread.sleep(1000);
    	  latch.countDown();
    	  
    	  }catch (Exception e) {
    		  System.out.println(e.getMessage());
		}
    }).start();
		
  latch.await();
  System.out.println("Main thread are finished now");
		
	}

}
