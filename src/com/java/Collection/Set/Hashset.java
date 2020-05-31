package com.java.Collection.Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*
 * HashSet
 */
public class Hashset {

	public static void main(String[] args) {
      /*
       * Implements Set Interface.
       * Underlying data structure for HashSet is hashtable.
       * As it implements the Set Interface, duplicate values are not allowed.
       * Objects that you insert in HashSet are not guaranteed to be inserted in same order. Objects are inserted based on their hash code.
       * NULL elements are allowed in HashSet.
       * HashSet also implements Searlizable and Cloneable interfaces.
       */
		//Constructor
		//a.HashSet h = new HashSet();Default initial capacity is 16 and default load factor is 0.75.
		HashSet<String> hst=new HashSet<>();
		//b.HashSet h = new HashSet(int initialCapacity);
		HashSet<String> set2=new HashSet<>(100);
		//c.HashSet h = new HashSet(int initialCapacity, float loadFactor);
		  float loadfactor=(float) 0.98;  
		HashSet<String> set3=new HashSet<>(19,loadfactor);
		//d.HashSet h = new HashSet(Collection C);
		HashSet<String> set4=new HashSet<>(set2);
		set4.add("B");
		set4.add("C");
		set4.add("D");
		set4.add("G");
		set4.forEach(s->System.out.println(s));
		
		//Methods
		/*
		 *a.boolean add(E e):Used to add the specified element if it is not present, if it is present then return false.
		 *b.void clear(): Used to remove all the elements from set.
		 *c.boolean contains(Object o): Used to return true if an element is present in set.
		 *d.boolean remove(Object o): Used to remove the element if it is present in set.
		 *e.Iterator iterator(): Used to return an iterator over the element in the set.
		 *f.boolean isEmpty(): Used to check whether the set is empty or not. Returns true
		 *g.int size(): Used to return the size of the set.
		 *h.Object clone(): Used to create a shallow copy of the set. 
		 */
		//Synchronized hash set
		Set s = Collections.synchronizedSet(new HashSet());
		
	}

}
