package com.java.Collection.Deque;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/*
 * Dequeue
 */
public class DequeInterface {

	public static void main(String[] args) {
      /*The java.util.Deque interface is a subtype of the java.util.Queue interface
       * The Deque is related to the double-ended queue that supports addition or removal of elements from either end of the data structure,
       *  it can be used as a queue (first-in-first-out/FIFO) or as a stack (last-in-first-out/LIFO)
       * these are intefaces Iterable->Collection->Queue->Deque.
       * Array deques prohibit the use of Null elements and do not accept any such elements.
       * Any concurrent access by multiple threads is not supported.
       * In the absence of external synchronization, Deque is not thread-safe.
       */
		//Constructor 
		Deque<String> deque=new LinkedList<>();
		deque.add("Sohan");
		deque.addLast("Mohan");
		deque.addFirst("Kamal");
		deque.push("Balwan");
		System.out.println(deque);
		deque.offer("Mali");//add in last
		deque.offerFirst("monu head");//add in head
		deque.offerLast("Alok tail");
		System.out.println();
		//methods of deque
		/*
		 * a.add(E e):Adds an element to the tail
		 * b.addFirst(E e):Adds an element to the head
		 * c.addLast(E e):Adds en element to the tail.
		 * d.boolean offer(E e):adds an element to tail and return true if insertion was successfully
		 * e.boolean offerFirst(E e):add element to head and return true if insertion successfully
		 * f.offerLast(E e):Add element to last of queue
		 * g.iterator():return iterator over the queue.
		 * h.descendingIterator():return reverse order iterator
		 * i.push(E e):add element to head;
		 * j.pop(E e):Remove the elements from head.
		 * k.removeFirst(E e):remove the element at the end
		 * l.removeLast(E e):remove the element at the tail
		 * m.poll():retrieves and remove from the head and return null if queue is empty
		 * n.pollFirst():Retrieves and removes the first element of this deque, or returns null if this deque is empty.
		 * o.pollLast():Retrieves and removes the last element of this deque, or returns null if this deque is empty.
		 * p.peek():Retrieves, but does not remove, the head of the queue represented by this deque
		 * q.peekFirst():Retrieves, but does not remove, the first element of this deque, or returns null if this deque is empty.
		 * r.peekLast():Retrieves, but does not remove, the last element of this deque, or returns null if this deque is empty.
		 */
	
	}

}
