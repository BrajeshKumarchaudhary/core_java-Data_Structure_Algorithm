package com.java.Collection.Deque;

import java.util.concurrent.LinkedBlockingDeque;

/*
 * LinkedBlockingDeque
 */
public class LinkedBlockingdequeue {

	public static void main(String[] args) throws InterruptedException {
    /*
     * The LinkedBlockingDeque class in Java is a part of the Java Collection Framework and implements the Collection interface and the AbstractQueue class.
     *.It also implements the BlockingDeque and provides an optionally-bounded functionality based on linked nodes.
     * When unspecified, the capacity is by default taken as Integer.MAX_VALUE.
     */
		//Constructor
		//a.LinkedBlockingDeque():default size Integer.MAX_VALUE
		LinkedBlockingDeque<String> lbq=new LinkedBlockingDeque<>();
		//b.LinkedBlockingDeque(int capacity): 
		LinkedBlockingDeque<String> lbq1=new LinkedBlockingDeque<>(100);
		//c.LinkedBlockingDeque(Collection<E> c):
		LinkedBlockingDeque<String> lbq2=new LinkedBlockingDeque<>(lbq1);
		//method summary
		/*
		 * a.put(E e):This method inserts the specified element into the queue represented by this deque (in other words, at the tail of this deque), waiting if necessary for space to become available.
		 * b.putFirst(E e): This method inserts the specified element at the front of this deque, waiting if necessary for space to become available.
		 * c.putLast(E e): This method inserts the specified element at the end of this deque, waiting if necessary for space to become available.
		 * d.take(): This method retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque), waiting if necessary until an element becomes available.
		 *.takeFirst():This method retrieves and removes the first element of this deque, waiting if necessary until an element becomes available.
		 *takeLast():This method retrieves and removes the last element of this deque, waiting if necessary until an element becomes available.
		 */
		System.out.println(""+lbq2.take());
		
	}

}
