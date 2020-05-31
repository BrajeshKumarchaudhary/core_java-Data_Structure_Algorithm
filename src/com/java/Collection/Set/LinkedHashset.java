package com.java.Collection.Set;

import java.util.LinkedHashSet;

/*
 * LinkedHashSet
 */
public class LinkedHashset {

	public static void main(String[] args) {
    /*
     * A LinkedHashSet is an ordered version of HashSet that maintains a doubly-linked List across all elements.
     * When the iteration order is needed to be maintained this class is used. 
     * LinkedHashSet lets us iterate through the elements in the order in which they were inserted
     * Contains unique elements only like HashSet. It extends HashSet class and implements Set interface.
     * Maintains insertion order.
     */
     //Constructor
	 //a.LinkedHashSet(): This constructor is used to create a default HashSet.
		LinkedHashSet<String> lsh1=new LinkedHashSet<>();
	 //b.LinkedHashSet(Collection C): Used in initializing the HashSet with the eleements of the collection C
      LinkedHashSet<String> lsh2=new LinkedHashSet<>(lsh1);
      //c.LinkedHashSet(int size): Used to initialize the size of the LinkedHashSet with the integer mentioned in the parameter.
       LinkedHashSet<String> lsh3=new LinkedHashSet<>(100);
        lsh3.add("Bnk");
        lsh3.add("gee");
        lsh3.forEach(sy->System.out.println(sy));
		
	}

}
