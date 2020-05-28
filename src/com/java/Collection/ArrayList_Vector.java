package com.java.Collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class ArrayList_Vector {

	public static void main(String[] args) {
     /*
      * synchronization – The first major difference between these two. Vector is synchronized and ArrayList isn't.
      * size growth – Another difference between the two is the way they resize while reaching their capacity. The Vector doubles its size. In contrast, ArrayList increases only by half of its length
      * iteration – And Vector can use Iterator and Enumeration to traverse over the elements. On the other hand, ArrayList can only use Iterator.
      * performance – Largely due to synchronization, Vector operations are slower when compared to ArrayList
      * framework – Also, ArrayList is a part of the Collections framework and was introduced in JDK 1.2. Meanwhile, Vector is present in the earlier versions of Java as a legacy class.   
      */
		ArrayList<String> list=new ArrayList<>();
		Vector<String> vector=new Vector<>();
		Iterator<String> it=list.iterator();
		Enumeration<String> enm=vector.elements();
		while(enm.hasMoreElements()) {
		System.out.println();
		}
	}

}
