package com.interview;

import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;
public class ConcurrentModificationException {

	public static void main(String[] args) {
     List<Integer> list=new LinkedList<>();
     list.add(1);
     list.add(2);
     list.add(3);
     list.add(4);
     Iterator<Integer> it=list.iterator();
     while(it.hasNext()) {
    	 System.out.println(it.next());
    	 //adding one elemenet more
    	 list.add(10);  //it throw concurrentModificationException.it is also fail-fast.due to  structural modification 
     }
     //fail-fast Which throw this Exception
     //ArrayList,HashMap
     
     //Fail-Safe which is not throw Exception
     //ConcurrentHashMap,CopyOnWriteArrayList
   
		
	}

}
