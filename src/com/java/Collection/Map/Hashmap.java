package com.java.Collection.Map;

import java.util.HashMap;

/*
 * HashMap
 */
public class Hashmap {

	public static void main(String[] args) {
        /*
         * HashMap is a part of java.util package.
         * HashMap extends an abstract class AbstractMap which also provides an incomplete implementation of Map interface.
         * It also implements Cloneable and Serializable interface. K and V in the above definition represent Key and Value respectively.
         * HashMap doesn’t allow duplicate keys but allows duplicate values. That means A single key can’t contain more than 1 value but more than 1 key can contain a single value.
         * HashMap allows null key also but only once and multiple null values.
         */
		
		//Constructor
		//a.HashMap(): It is the default constructor which creates an instance of HashMap with initial capacity 16 and load factor 0.75.
		 HashMap<Integer,String> map=new HashMap<>();
		 //b.HashMap(int initial capacity): It creates a HashMap instance with specified initial capacity and load factor 0.75.
		 HashMap<Integer,String> map2=new HashMap<>(200);
		 //c.HashMap(int initial capacity, float loadFactor): It creates a HashMap instance with specified initial capacity and specified load factor.
		HashMap<Integer, String> map3=new HashMap<>(100, (float)1);
		//d.HashMap(Map map): It creates instance of HashMap with same mappings as specified map.
	    HashMap<Integer, String> map4=new HashMap<>(map);
	    
	    //Method Summarry
	    /*
	     * a.void clear(): Used to remove all mappings from a map.
	     * b.boolean containsKey(Object key): Used to return True if for a specified key, mapping is present in the map.
	     * c.boolean containsValue(Object value): Used to return true if one or more key is mapped to a specified value.
	     * d.Object clone(): It is used to return a shallow copy of the mentioned hash map.
	     * e.boolean isEmpty(): Used to check whether the map is empty or not. Returns true if the map is empty.
	     * f.Set entrySet(): It is used to return a set view of the hash map.
	     * g.Object get(Object key): It is used to retrieve or fetch the value mapped by a particular key.
	     * i.Set keySet(): It is used to return a set view of the keys.
	     * j.int size(): It is used to return the size of a map.
	     * k.Object put(Object key, Object value): It is used to insert a particular mapping of key-value pair into a map.
	     * l.putAll(Map M): It is used to copy all of the elements from one map into another.
	     * m.Object remove(Object key): It is used to remove the values for any particular key in the Map.
	     * n.replace(K key, V oldValue, V newValue): This method replaces the entry for the specified key only if currently mapped to the specified value.
	     */
	    map4.put(1, "Kanpur");
	    map4.put(2, "Lucknow");
	    map4.put(3, "Allahabad");
	    map4.entrySet().forEach(k->System.out.println(k.getKey()+"--"+k.getValue()));
	
	}

}
