package com.java.Collection.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 * All offer a key->value map and a way to iterate through the keys.
 *  The most important distinction between these classes is the time guarantees and the ordering of the keys.
 */
public class HashMap_LinkedHash_TreeMap_HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyHashMap();
		LinkedHashMap1();
		TreeMap1();
	}
	
	private static void MyHashMap()
	{
		/*HashMap offers 0(1) lookup and insertion. 
		 * If you iterate through the keys, though, the ordering of the keys is essentially arbitrary.
		 *  It is implemented by an array of linked lists.
		 * 
		 * A HashMap contains values based on the key.
         *It contains only unique elements.
         *It may have one null key and multiple null values.
         *It maintains no order.
		 */
		System.out.println("---------HashMap---------------");
		Map<Integer,String> hashmap=new HashMap<>();
		hashmap.put(1, "Brajesh");
		hashmap.put(1, "Brajesh");
		hashmap.put(null, "b");
		hashmap.put(null, "k");
		hashmap.put(3, null);
		hashmap.put(4, null);
		hashmap.put(7, "djwnd");
		hashmap.forEach((k,v)->System.out.println(k+"_"+v));
	}
	private static void LinkedHashMap1()
	{
		/*LinkedHashMap offers 0(1) lookup and insertion.
		 *  Keys are ordered by their insertion order. 
		 * It is implemented by doubly-linked buckets.
		 * 
		 * A LinkedHashMap contains values based on the key.
         * It contains only unique elements.
         * It may have one null key and multiple null values.
         * It is same as HashMap instead maintains insertion order.
		 */
		System.out.println("----------------LinkedHashMap------------");
		Map<Integer,String> hashmap=new LinkedHashMap<>();
		hashmap.put(7, "djwnd");
		hashmap.put(1, "Brajesh");
		hashmap.put(1, "Brajesh");
		hashmap.put(null, "b");
		hashmap.put(null, "k");
		hashmap.put(3, null);
		hashmap.put(4, null);
		hashmap.put(11, null);
		
		hashmap.forEach((k,v)->System.out.println(k+"_"+v));
		
		
	}
	
	private static void TreeMap1()
	{
		System.out.println("-------------TreeMap------------");
		/*
		 * TreeMap offers O(log N) lookup and insertion. 
		 * Keys are ordered, so if you need to iterate through the keys in sorted order, you can. This means that keys must implement the Comparable interface. 
		 * TreeMap is implemented by a Red-Black Tree.
		 * A TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
         * It contains only unique elements.
         * It cannot have null key but can have multiple null values.
         * It is same as HashMap instead maintains ascending order(Sorted using the natural order of its key).
		 */
		Map<Integer,String> hashmap=new TreeMap<>();
		hashmap.put(7, "djwnd");
		hashmap.put(1, "Brajesh");
		hashmap.put(1, "Brajesh");
		hashmap.put(3, null);
		hashmap.put(4, null);
		hashmap.put(11, null);
		
		hashmap.forEach((k,v)->System.out.println(k+"_"+v));
		
	}
	
	
	

}
