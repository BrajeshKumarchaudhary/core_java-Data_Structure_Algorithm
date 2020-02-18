package com.java.Collection;

import java.util.*;
import java.util.Map.Entry;
public class HashTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Hashtable<Integer,String> ht=new Hashtable<>();
      ht.put(1, "a");
      ht.put(2, "b");
      ht.put(3, "c");
      ht.put(4, "d");
      System.out.println(ht.values());
      Iterator<Entry<Integer, String>> it=ht.entrySet().iterator();
      while(it.hasNext())
      {
    	  Entry<Integer, String> en=it.next();
    	  System.out.println(en.getValue());
      }
	}

}
