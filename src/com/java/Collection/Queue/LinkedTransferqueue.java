package com.java.Collection.Queue;

import java.util.concurrent.LinkedTransferQueue;

/*
 * LinkedTransferQueue
 */
public class LinkedTransferqueue {

	public static void main(String[] args) {
     /*The LinkedTransferQueue class in Java is a part of the Java Collection Framework
      * and implements the Collection interface and the AbstractQueue class
      * It also implements the TransferQueue and provides an unbounded functionality based on linked nodes. 
      */
		//Constructors in Java LinkedTransferQueue:
		//a.LinkedTransferQueue():
		LinkedTransferQueue<Integer> ltq=new LinkedTransferQueue<>();
		//b.LinkedTransferQueue(Collection<E> c):
		LinkedTransferQueue<Integer> ltq1=new LinkedTransferQueue<>(ltq);
		ltq1.add(20);
		ltq1.add(21);
		ltq1.add(22);
		//printElements
		ltq1.forEach(n->System.out.println(n));
		
	}

}
