package com.java.Collection.Hashtable;

import java.util.Collections;
import java.util.Hashtable;

/*
 * HashTable
 */
public class HashTable {

	public static void main(String[] args) {
      /*
       * it is similar to HashMap, but is synchronised.
       * Hashtable stores key/value pair in hash table.
       * In Hashtable we specify an object that is used as a key, and the value we want to associate to that key. The key is then hashed, and the resulting hash code is used as the index at which the value is stored within the table.
       */
		//Constructor
		//a.Hashtable(): This is the default constructor.
		Hashtable<Integer, String> h = new Hashtable<Integer, String>();
		//b.Hashtable(int size): This creates a hash table that has initial size specified by size.
		Hashtable<String, Integer> h1=new Hashtable<>(200);
		//c.Hashtable(Map m): 
		Hashtable<String, Integer> h2=new Hashtable<>(h1);
		//Methods Summarry
		/*
		 * a.void clear():method clears the hashtable so that it contains no keys.
		 * b.Object clone() : used to create a shallow copy of this hashtable.
		 * c.contains(Object value): The java.util.Hashtable.contains(Object value) method in Java is used to check whether a particular value is being mapped by any keys present in the Hashtable.
		 * d.boolean containsKey(Object key) : tests if some key maps into the specified value in this hashtable.
		 * e.boolean containsValue(Object value) : returns true if this hash table maps one or more keys to this value.
		 * f.Enumeration elements() :Returns an enumeration of the values obtained in hash table.
		 * g.entrySet() : used to get a set view of the entries contained in this hash table.
		 * h.boolean equals(Object o) : used to compare specified object with this Map for equality.
		 * i.Object get(Object key) : used to get the object that contains the value associated with key.
		 * j.boolean isEmpty() :used to test if this hashtable maps no keys to values.
		 * k.Enumeration keys() :used to get enumeration of the keys contained in the hash table.
		 * l.Object put(Object key, Object value) :maps the specified key to the specified value in this hashtable.
		 * m.KeySet() :used to get a Set view of the keys contained in this hash table.
		 * n.void putAll(Map t) : copies all of the mappings from the specified map to this hashtable.
		 * o.Object remove(Object key) :Removes key and its value
		 * p.int size() :returns the number of entries in hash table.
		 * q.values() :used to get a Collection view of the values contained in this Hashtable
		 */
		 h2.put("Brajesh", 200);
		 h2.put("Brajesh", 200);
		 h2.put("Brajesh", 200);
		 h2.put("Ankit", 200);
		 h2.entrySet().forEach((v)->System.out.println(v.getKey()+" "+v.getValue()));
		 System.out.println(h2.keys());
		 System.out.println(h2.values());
		 
		
	}

}
