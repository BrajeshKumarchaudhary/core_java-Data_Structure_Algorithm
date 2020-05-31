package com.java.Collection.Set;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/*
 * Tree Set
 */
public class Treeset {

	public static void main(String[] args) {
   /*
    * TreeSet implements the SortedSet interface so duplicate values are not allowed.
    * Objects in a TreeSet are stored in a sorted and ascending order.
    * TreeSet does not preserve the insertion order of elements but elements are sorted by keys.
    * TreeSet does not allow to insert Heterogeneous objects. It will throw classCastException at Runtime if trying to add hetrogeneous objects.
    * TreeSet is basically implementation of a self-balancing binary search tree like Red-Black Tree. Therefore operations like add, remove and search take O(Log n) time. 
    * And operations like printing n elements in sorted order takes O(n) time.
    */
	//Constructor
		//a.TreeSet t = new TreeSet();This will create empty TreeSet object in which elements will get stored in default natural sorting order.
		 TreeSet<String> ts1=new TreeSet<>();
		//b.TreeSet t = new TreeSet(Comparator comp):This constructor is used when external specification of sorting order of elements is needed.
		 TreeSet<String> ts2=new TreeSet<>(Comparator.reverseOrder());
        //c.TreeSet t = new TreeSet(Collection col);
		 TreeSet<String> ts3=new TreeSet<>(ts1);
		 //d.TreeSet t = new TreeSet(SortedSet s);
		 ts1.add("C");
		 ts1.add("A");
		 ts1.add("Z");
		 ts1.forEach(s->System.out.println(s));
		 ts2.add("C");
		 ts2.add("A");
		 ts2.add("Z");
		 System.out.println("--"+ts2.lower("A"));
		 ts2.forEach(st->System.out.println(st));
		 //Synchronized HashSet
		 TreeSet ts = new TreeSet();
		 Set syncSet = Collections.synchronizedSet(ts); 
	}

}
