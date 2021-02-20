package com.java.threads;

public class ThreadFunction {

	public static void main(String[] args) throws InterruptedException {
 
		long start =System.currentTimeMillis();
		System.out.println("Start Time --"+start);
		Operation obj=new Operation();
		Thread t1=new Thread(()-> {
			obj.printSum(20, 30);
		});
		t1.start();
		//sleep()
		/*
		 * that can be used to pause the execution of current thread for specified milliseconds and nanoseconds. 
		 */
//		t1.sleep(2000);
		//Sleep();
		System.out.println("Total Time "+(System.currentTimeMillis()-start));
       
		//join():
		/*
		 * Sometimes we need to wait for other threads to finish it’s execution before we can proceed.
		 *  We can achieve this using Thread join,
		 */
		Thread t2=new Thread(()-> {
			obj.printSum(1000, 1000);
		
	});
		t2.setDaemon(true);
		t2.join();
		
		t2.start();
		
		//
		
	}

}

class Operation {
	public void printSum(int a,int b) {
		System.out.println("Sum is "+(a+b));
	}
}
