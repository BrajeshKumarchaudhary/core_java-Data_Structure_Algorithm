package com.java.Collection.Map;

import java.util.HashMap;
import java.util.Map;

/*
 * Map InterFace in java
 */
public class MapInterface {

	public static void main(String[] args) {
      /*The java.util.Map interface represents a mapping between a key and a value
       * A Map cannot contain duplicate keys and each key can map to at most one value. Some implementations allow null key and null value like the HashMap and LinkedHashMap, but some do not like the TreeMap.
       * The order of a map depends on specific implementations, e.g TreeMap and LinkedHashMap have predictable order, while HashMap does not.
       * There are two interfaces for implementing Map in java: Map and SortedMap, and three classes: HashMap, TreeMap and LinkedHashMap.
       */
		//creating the map
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "Brajesh");
		map.put(2, "Sonu");
		map.put(3, "Govind");
		map.entrySet().forEach(n->System.out.println(n.getKey()+"--"+n.getValue()));
		
	}

}
