package com.java.Collection.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

/*
 * ArrayDeque
 */
public class Arraydequeue {

	public static void main(String[] args) {
		/*ArrayDeque in Java provides a way to apply resizable-array in addition to the implementation of the Deque interface.
		 * It is also known as Array Double Ended Queue or Array Deck
		 * Array deques have no capacity restrictions and they grow as necessary to support usage.
		 * They are not thread-safe which means that in the absence of external synchronization, 
		 * ArrayDeque does not support concurrent access by multiple threads.
		 * Null elements are prohibited in the ArrayDeque.
		 * ArrayDeque class is likely to be faster than Stack when used as a stack.
		 * ArrayDeque class is likely to be faster than LinkedList when used as a queue.
		 */
		
		//Constructor
		//a.ArrayDeque()
		Deque<String> dq=new ArrayDeque<>();
		//b.ArrayDeque(Collection c)
		Deque<String> dq1=new ArrayDeque<>(dq);
		//c.ArrayDeque(int numofElements)
		Deque<String> adq=new ArrayDeque<>(200);
		  

	}

}
