package com.java.Collection.Queue;

import java.util.concurrent.ConcurrentLinkedQueue;

/*
 * Here we cover  ConcurrentLinkedQueue
 */
public class ConcurrentLinkedqueue {

	public static void main(String[] args) {
      /*The ConcurrentLinkedQueue class in Java is a part of the Java Collection Framework
       * and implements the Collection interface and the AbstractCollection class
       * It is used to implement Queue with the help of LinkedList concurrently.
       */
		/*
		 * Constructors in Java ConcurrentLinkedQueue:
		 * a.ConcurrentLinkedQueue():create and empty queue.
		 * b.ConcurrentLinkedQueue(Collection<E> c): create a queue with given collection elements
		 */
		//create an LinkedBlockingQueue
		ConcurrentLinkedQueue<Integer> q=new ConcurrentLinkedQueue<>();
		q.add(20);
		q.add(21);
		q.add(22);
		q.add(23);
		//print the elements
		q.stream().forEach(n->System.out.println(n));
		//creating a queue with existing elements queue
		ConcurrentLinkedQueue<Integer> lbq=new ConcurrentLinkedQueue<>(q);
		lbq.add(30);
		//print the elements
		lbq.forEach(n->System.out.println(n));
		//methods Summary
		/*
		 * a.add(E e):add the elements in end of queue.
		 * b.addAll(Collection c):appends the all elements end of queue.
		 * c.boolean contains():this methods return true if specified elements contains in queue.
		 * d.boolean isEmpty():This method returns true if queue is empty.
		 * e.offer(E e):add the elements end of queue.
		 * E peek():this methods retrieve ,but does not remove the head of elements
		 * E poll():this method retrieve.and remove the head of queue.
		 * int size():return number of elements.
		 * Object toArray():return an array containing all elements.
		 */
	}

}
