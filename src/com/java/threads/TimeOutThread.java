package com.java.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TimeOutThread {

	public static void main(String[] args) {
		ExecutorService threadPool=Executors.newFixedThreadPool(2);
		// create the Thread;
//		Thread t1 = new Thread(() -> {
//			System.out.println();
//		});
		
		//for TimeOut purpose instead of calling Runnable call Callabble implementations.
		
		//start thread;
		Future<Integer>result= threadPool.submit(()->{
			return 1; 
		 });
		
		//wait for ten minutes
		result.cancel(true);
		
		// Set The Time

		// Stop The thread;

	}

}
