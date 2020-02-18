package com.java.Collection;

import java.util.*;
public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1, "brajeshkumar");
		map.put(2, "brajeshkumar");
		map.put(3, "brajeshkumar");
		map.put(4, "brajeshkumar");
		map.put(5, "brajeshkumar");
  //by foreach
		map.forEach((key,value)->
			System.out.print("key="+key+' '+"value="+value));
//using Iterator
		System.out.println("Map using iterrator");
		Iterator<Map.Entry<Integer,String>> it=map.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry<Integer, String> entry = it.next();
			System.out.print("key="+entry.getKey()+""+"value="+entry.getValue());
		}
		
		System.out.println(map.keySet());
		System.out.print(map.values());
		System.out.print("Using key");
		for (Integer i : map.keySet()) {
			System.out.print(i+"="+map.get(i));
		}
		
		
		
		
	}

}
