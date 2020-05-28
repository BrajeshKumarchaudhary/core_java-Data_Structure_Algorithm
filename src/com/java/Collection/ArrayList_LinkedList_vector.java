package com.java.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class ArrayList_LinkedList_vector {

	public static void main(String[] args) {
		/*
		 * Insertions are easy and fast in LinkedList as compared to ArrayList because
		 * there is no risk of resizing array and copying content to new array if array
		 * gets full which makes adding into ArrayList of O(n) in worst case, while
		 * adding is O(1) operation in LinkedList in Java. ArrayList also needs to be
		 * update its index if you insert something anywhere except at the end of array.
		 * Removal also better in LinkedList than ArrayList due to same reasons as
		 * insertion. LinkedList has more memory overhead than ArrayList because in
		 * ArrayList each index only holds actual object (data) but in case of
		 * LinkedList each node holds both data and address of next and previous node.
		 * Both LinkedList and ArrayList require O(n) time to find if an element is
		 * present or not. However we can do Binary Search on ArrayList if it is sorted
		 * and therefore can search in O(Log n) time.
		 */

	}

	private static void ArrayList1() {
		/*
		 * -Implemented with the concept of dynamic array.
		 * It is not Synchronized 
		 * it is uses only Iterator to traverse.
		 */

		System.out.println("----ArrayList----");
		ArrayList<String> list = new ArrayList<>();
	}

	private static void LinkedList1() {
		/*
		 * Implemented with the concept of doubly linked list.
		 */
		LinkedList<String> list = new LinkedList<>();
	}

	private static void vector() {
		/*
		 * Vector is also implemented dynamic array 
		 * Vector is Synchronized Which means only one thread can access at time.
		 * Vector can use both Iterator and Enumeration for traversing.
		 */
		System.out.println("-----Vector-----");
		Vector<Integer> v=new Vector<>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		System.out.println("Travesing by Iterator");
		Iterator<Integer> it=v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
	}

}
