package com.java.Collection.Vector;

import java.util.Vector;

/*
 * Vector
 */
public class VectorClass {

	public static void main(String[] args) {
    /*
     * Vector implements a dynamic array that means it can grow or shrink as required. Like an array, it contains components that can be accessed using an integer index
     * They are very similar to ArrayList but Vector is synchronised and have some
     * It extends AbstractList and implements List interfaces.
     */
	   //Constructor
	   //a.Vector():Creates a default vector of initial capacity is 10.
		Vector<String> v=new Vector<>();
	    //b.Vector(int size): 
		Vector<String> v1=new Vector<>(200);
		//c.Vector(Collection c):Creates a vector that contains the elements of collection c.
		 Vector<String> v2=new Vector<>(v1);
		//d.Vector(int size, int incr): Creates a vector whose initial capacity is specified by size and increment is specified by incr. It specifies the number of elements to allocate each time that a vector is resized upward.
		//Method Summary
		 /*a.boolean add(E e):add element into vector
		  * b.void add(int index,E e):insert the elements at specified position
		  * c.boolean addAll(Collection c) This method appends all of the elements in the specified Collection to the end of this Vector.
		  *d.boolean addAll(int index,Collection c):insert the collection elements at specfied elements
		  *e.void clear():Remove all the elements from vector
		  *f.Object Clone():clone the vector objject into another
		  *g.boolean conatins(E e):This method retunr true element exists in vector
		  *h.Object get(int index):get indexed value
		  *i.boolean isEmpty():return true no elements into vector
		  *j. 
		 */
		 v2.add("nng");
		 v2.add("Sonu");
		 v2.add("Kamla");
		 v2.forEach(s->System.out.println(s));
	}

}
