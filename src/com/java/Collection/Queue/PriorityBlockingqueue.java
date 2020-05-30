package com.java.Collection.Queue;

import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;

/*
 * PriorityBlockingQueue
 */
public class PriorityBlockingqueue {

	public static void main(String[] args) {
      /*PriorityBlockingQueue is an unbounded blocking queue that uses the same ordering rules as class PriorityQueue and supplies blocking retrieval operations.
       */
		//Constructor summary
		//a.PriorityBlockingQueue()
		PriorityBlockingQueue<Integer> pbq=new PriorityBlockingQueue<>();
		//b.PriorityBlockingQueue(Collection c)
		PriorityBlockingQueue<Integer> lbq1=new PriorityBlockingQueue<>(pbq);
		//c.PriorityBlockingQueue(int initialCapacity)
		PriorityBlockingQueue<Integer> pbq1=new PriorityBlockingQueue<>(100);
		//d.PriorityBlockingQueue(int initialCapacity, Comparator comparator)
		PriorityBlockingQueue<Integer> lbq2=new PriorityBlockingQueue<>(100, Comparator.reverseOrder());
	   lbq2.add(21);
	   lbq2.add(22);
	   lbq2.add(25);
	   lbq2.add(29);
	   //print the elements
	   lbq2.forEach(n->System.out.println(n));
	}

}
