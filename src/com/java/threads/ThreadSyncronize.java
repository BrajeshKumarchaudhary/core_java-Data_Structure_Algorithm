package com.java.threads;

public class ThreadSyncronize {

	public static void main(String[] args) throws InterruptedException {
	PrintEven p=new PrintEven();
		Thread t1=new Thread(new Runnable() {
		
		@Override
		public void run() {
                			try {
								p.printE(10,20);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
		}
	});
		Thread t2=new Thread(new Runnable() {
		
		@Override
		public void run() {
                			try {
								p.printE(30,40);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
                			try {
								Thread.sleep(200);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
		}
	});
		t1.start();
		t2.start();

	}

}

class PrintEven{
	public synchronized  void printE(int start,int last) throws InterruptedException {
		for(int i=start;i<=last;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
			
		}
	}
}