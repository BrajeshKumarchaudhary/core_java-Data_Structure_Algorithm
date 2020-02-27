package com.java.Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    LinkedList<String> list=new LinkedList<>();
        list.add("brajesh kumar");
        list.add("maneesh kumar");
        list.add("Govind kumar");
        list.addFirst("sonu");
        list.addLast("kamla");
        Iterator<String> it=list.iterator();
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
		
		
	}

}
