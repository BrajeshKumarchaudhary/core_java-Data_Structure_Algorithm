package com.java.threads;
/*
 * Deadlock in java
 */
public class DeadLockInJava {

	public static void main(String[] args) {
       /*
        * We can create a deadlock by just using Main thread, i.e. by just using a single thread.
        */
		try {
			System.out.println("Entering into Deadlock"); 
            Thread.currentThread().join(); 
         // the following statement will never execute 
            System.out.println("This statement will never execute"); 
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}

}
