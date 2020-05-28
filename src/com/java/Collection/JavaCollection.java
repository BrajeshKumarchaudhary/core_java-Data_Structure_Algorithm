package com.java.Collection;

import java.util.Hashtable;
import java.util.Vector;

/*
 * A Collection is a group of individual objects represented as a single unit. 
 * Java provides Collection Framework which defines several classes and interfaces to represent a group of objects as a single unit.
 *Java program why we need collection framework
 */
public class JavaCollection {

	public static void main(String[] args) {
		// Creating instances of array, vector and hashtable 
        int arr[] = new int[] {1, 2, 3, 4}; 
        Vector<Integer> v = new Vector<Integer>(); 
        Hashtable<Integer, String> h = new Hashtable<Integer, String>(); 
        v.addElement(1); 
        v.addElement(2); 
        h.put(1,"brajesh"); 
        h.put(2,"Kumar"); 
  
        // Array instance creation requires [], while Vector 
        // and hastable require () 
        // Vector element insertion requires addElement(), but 
        // hashtable element insertion requires put() 
  
        // Accessing first element of array, vector and hashtable 
        System.out.println(arr[0]); 
        System.out.println(v.elementAt(0)); 
        System.out.println(h.get(1)); 
  
        // Array elements are accessed using [], vector elements 
        // using elementAt() and hashtable elements using get() 
	}

}
