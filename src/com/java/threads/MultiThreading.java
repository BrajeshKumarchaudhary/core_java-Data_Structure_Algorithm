package com.java.threads;

/*
 *Multithreading
 */
public class MultiThreading{

	public static void main(String[] args) {
      /*
       *Multithreading is a Java feature that allows concurrent execution of two or more parts of a program for maximum utilization of CPU.
       *Each part of such program is called a thread.
       *So, threads are light-weight processes within a process.
       *Threads can be created by using two mechanisms :
       *a.Extending the Thread class
       *b.Implementing the Runnable Interface
       */
		Even number=new Even();
		number.start();
		Thread num=new Thread(new Even2());
		num.start();
	}

}
//Thread creation by extending the Thread class
/*
 *We create a class that extends the java.lang.Thread class. 
 *This class overrides the run() method available in the Thread class.  
 */
class Even extends Thread
{
	public void run()
	{
		for(int i=1;i<20;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}

//Thread creation by implementing the Runnable Interface
/*
 *We create a new class which implements java.lang.Runnable interface and override run() method.
 */

class Even2 implements Runnable
{

	@Override
	public void run() {
		for(int i=0;i<20;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
	
}


