package com.java.Collection.Deque;

import java.util.concurrent.ConcurrentLinkedDeque;

/*
 * ConcurrentLinkedDeque
 */
public class ConcurrentLinkedDdeque {

	public static void main(String[] args) {
     /*The ConcurrentLinkedDeque class in Java is a part of the Java Collection Framework
      *  It is used to implement Deque with the help of LinkedList concurrently.
      */
		//Constructor
		//a.ConcurrentLinkedDeque(): 
		ConcurrentLinkedDeque<String> clq=new ConcurrentLinkedDeque<>();
		
		//b.ConcurrentLinkedDeque(Collection<E> c):
       ConcurrentLinkedDeque<String> clq1=new ConcurrentLinkedDeque<>(clq);
       clq.addFirst("Sonu");
       System.out.println(clq);
	}

}
