package com.java.threads;

class Print 
{
	public void printEven(int r1,int r2)
	{
		for(int i=r1;i<=r2;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}



public class PrintEvenNumber extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print p1=new Print();
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				p1.printEven(10, 20);
			}
		});
	Thread t2=new Thread(new Runnable() {
		
		@Override
		public void run() {
			p1.printEven(10, 20);
		}
	});
	t1.start();
	t2.start();
	}
}

