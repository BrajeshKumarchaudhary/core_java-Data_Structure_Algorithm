package com.java.Collection.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * Set interface
 */
public class SetInterface {

	public static void main(String[] args) {
     /*
      * Set is an interface which extends Collection. 
      *it is an unordered collection of objects in which duplicate values cannot be stored.
      *Basically, Set is implemented by HashSet, LinkedHashSet or TreeSet (sorted representation).
      */
     //Constructor
		Set<Integer> set=new HashSet<>();
		set.add(20);
		set.add(23);
		set.add(19);
		set.add(2);
		Set<Integer> set2 =new HashSet<>();
		set2.addAll(Arrays.asList(new Integer[] {2,3,4,6,8}));
		System.out.println("Union of two set");
		Set<Integer> union=new HashSet<>(set);
		union.addAll(set2);
		System.out.println("Intersection");
		Set<Integer> inter=new HashSet<>(set);
		inter.retainAll(set2);
		System.out.println("Difference");
		Set<Integer> diff=new HashSet<>(set);
		diff.removeAll(set2);
	}

}
