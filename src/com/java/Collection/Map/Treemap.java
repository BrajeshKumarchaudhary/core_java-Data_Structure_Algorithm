package com.java.Collection.Map;

import java.util.TreeMap;

/*
 * TreeMap
 */
public class Treemap {

	public static void main(String[] args) {
   /*
    * TreeMap can be a bit handy when we only need to store unique elements in a sorted order.
    * Java.util.TreeMap uses a red-black tree in the background which makes sure that there are no duplicates
    * additionally it also maintains the elements in a sorted order.
    */
	//Constructor
	 //TreeMap<K, V> hmap = new TreeMap<K, V>();
		TreeMap<String,String> tm=new TreeMap<>();
	 //TreeMap<String, String> map=new TreeMap<>(Comparator.reverseOrder()); Descending order
		tm.put("Brajesh", "A");
		tm.put("Ankit", "B");
		tm.put("Govind", "B");
		tm.entrySet().forEach(n->System.out.println(n.getKey()+" "+n.getValue()));
		
	}

}
