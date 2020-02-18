package com.java.threads;

public class THread extends Thread {

	public  void run()
	{
		System.out.print("THread1");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		THread t1=new THread();
		t1.start();     
	}
}
