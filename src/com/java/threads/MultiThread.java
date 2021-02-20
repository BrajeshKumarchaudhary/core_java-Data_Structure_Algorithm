package com.java.threads;

public class MultiThread implements  Runnable {
	public void run() {
	   System.out.print(Thread.currentThread().getId());	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThread t1=new MultiThread();
		Thread t2=new Thread(t1);
		t2.notify();
		t2.start();
	}

}

class Thread1
{
	public void t1()
	{
		System.out.print("t1");
	}
}
class Thread2
{
	public void t1()
	{
		System.out.print("t1");
	}
}
class Thread3
{
	public void t1()
	{
		System.out.print("t1");
	}
}

class Thread4
{
	public void t1()
	{
		System.out.print("t1");
	}
}
