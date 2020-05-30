package com.java.Collection.Queue;

import java.util.concurrent.LinkedBlockingQueue;

/*
 * here we cover LinkedBlockingQueue
 */
public class LinkedBlockingqueue {

	public static void main(String[] args) {
  /*LinkedBlockingQueue is an optionally-bounded blocking queue based on linked nodes.
   * It means that the LinkedBlockingQueue can be bounded, if its capacity is given, else the LinkedBlockingQueue will be unbounded
   * The capacity can be given as a parameter to the constructor of LinkedBlockingQueue.
   * The capacity, if unspecified, is equal to Integer.MAX_VALUE. 
   * Linked nodes are dynamically created upon each insertion, till the capacity of the queue is not filled.
   */
  //Constructor summary
		//a.LinkedBlockingQueue()
		LinkedBlockingQueue<Integer> lbq=new LinkedBlockingQueue<>();
		//b.LinkedBlockingQueue(Collection c)
		LinkedBlockingQueue<Integer> lbq1=new LinkedBlockingQueue<>(lbq);
		//c.LinkedBlockingQueue(int initialCapacity)
		LinkedBlockingQueue<Integer> lbq2=new LinkedBlockingQueue<>();
		lbq2.add(20);
		lbq2.add(21);
		lbq2.add(22);
		
		//print Elements
		lbq2.forEach(n->System.out.println(n));
		//method summary
		/*
		 * a.void clear():remove all the elements
		 * b.boolean contains():return true if specified value exists in queue
		 *c.E peek():retrieve value and not remove the head of queue.
		 *d.E poll():retrieves and reomve head of the queue
		 *e.E take(): Retrieves and removes the head of this queue, waiting if necessary until an element becomes available.
		 */
	}

}
