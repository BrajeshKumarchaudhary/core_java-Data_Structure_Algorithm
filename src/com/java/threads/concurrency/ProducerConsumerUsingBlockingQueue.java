package com.java.threads.concurrency;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


public class ProducerConsumerUsingBlockingQueue {

	public static void main(String[] args) {
		BlockingQueue<Integer> shared=new LinkedBlockingQueue<Integer>();
        Producer p=new Producer(shared);
        Consumer c=new Consumer(shared);
		p.start();
	    c.start();
		
	}

}



class Producer extends Thread{
	private BlockingQueue<Integer> sharedQueue;
	public Producer(BlockingQueue<Integer> sharedque) {
		super("PRODUCER");
		this.sharedQueue=sharedque;
	}
	@Override
	public void run() {
		for (int i = 0; i <10; i++) {
			System.out.println(getName()+" produced"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				sharedQueue.put(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


class Consumer extends Thread{
	private BlockingQueue<Integer> sharedQueue;
	public Consumer(BlockingQueue<Integer> sharedque) {
		super("CONSUMER");
		this.sharedQueue=sharedque;
	}
	@Override
	public void run() {
		while(true)
			try {
				System.out.println(getName()+" consumed"+sharedQueue.take());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}