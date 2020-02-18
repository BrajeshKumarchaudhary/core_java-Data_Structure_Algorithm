package com.java.Collection;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashSet<String> hs=new HashSet<>();
	hs.add("India");
	hs.add("canada");
	hs.add("china");
	hs.add("pakistan");
	hs.forEach(System.out::println);
    Iterator<String> it=hs.iterator();
    while(it.hasNext())
    {
    	System.out.println(""+it.next());
    }
    for(String str:hs)
    {
    	System.out.println(""+str);
    }

	}

}
