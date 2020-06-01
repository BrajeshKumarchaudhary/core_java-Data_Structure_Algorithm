package com.java.Collection.Map;

import java.util.LinkedHashMap;

/*
 * LinkdeHashMap
 */

public class LinkedHashmap {

	public static void main(String[] args) {
   /*
    * A LinkedHashMap contains values based on the key. It implements the Map interface and extends HashMap class.
    * It contains only unique elements
    * It may have one null key and multiple null values
    * It is same as HashMap with additional feature that it maintains insertion order.
    */
		
	//Constructor
	//a.LinkedHashMap(): This is used to construct a default LinkedHashMap constuctor.
		LinkedHashMap<String, String> map1=new LinkedHashMap<>();
	//b.LinkedHashMap(int capacity): It is used to initialize a particular LinkedHashMap with a specified capacity.
		LinkedHashMap<String, String> map2=new LinkedHashMap<>(200);
	//c.LinkedHashMap(Map m_a_p): It is used to initialize a particular LinkedHashMap with the elements of the specified map.
      LinkedHashMap<String, String> map3=new LinkedHashMap<>(map1);
      map3.put("Brajesh", "A+");
      map3.put("Ankit", "B+");
      map3.put("Maneesh", "A+");
      map3.entrySet().forEach(n->System.out.println(n.getKey()+" "+n.getValue()));
	}

}
