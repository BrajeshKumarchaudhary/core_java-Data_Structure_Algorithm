package com.java.classesObject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

import com.java.Collection.MyStack;
import com.java.linkedlist.LinkedList;

public class MyArrayList {

/*
 * 
 */
	public ArrayList<Integer> createList(int type)
	{
		ArrayList<Integer> list=new ArrayList<>();
		switch(type)
		{
		case 1:
			list= new ArrayList<Integer>();
			break;
			default:
				new ArrayList<Integer>();
		}
		return list;
	}
	
	/*
	 * for each in arrayList
	 */
	  private static  void  displayUsingForeach(ArrayList<String> list3)
	  {
		  list3.forEach(st->System.out.println(st));
	  }
	  /*
	   * available function with arrayList
	   */
	    private static void doDemo(int methodNo,ArrayList<Integer> mylist)
	    {
	    	switch(methodNo)
	    	{
	    	case 1:
	    		//foreach method
	    		mylist.forEach(st->System.out.print(st));
	    		break;
	    	case 2:
	    		//retailAll remove all the element which is not contain passing list value return boolean
	    		ArrayList<Integer> list=new ArrayList<>();
	    		mylist.retainAll(list);
	    		break;
	    	case 3:
	    		//removeif remove all the element that is specified return boolean
	    		mylist.removeIf(n->(n%2==0));
	    		mylist.stream().distinct().collect(Collectors.toList());//Remove list Duplicate
	    		break;
	    	case 4:
	    		//conatins return true if specified value exists
	    		mylist.contains(90);
	    	case 5:
	    		//remove element at specified position
	    		mylist.remove(0);
	    		break;
	    	case 6:
	    		//get(int index) return the specified value by passing index
	    		mylist.get(0);
	    		break;
	    		
	    	case 7:
	    		//subList(int from index.int toindex) return specified list
	    		List<Integer> list2=mylist.subList(0, 5);
	    		break;
	    	case 8:
	    		//set(int index,int element) set the element at specified postion
	    		mylist.set(0, 30);
	    		break;
	    	case 9:
	    		//size return the number of element in list
	    		mylist.size();
	    		break;
	    		
	    	case 10:
	    		//isEmpty() return true if list is empty
	    		mylist.isEmpty();
	    		break;
	    		
	    	case 11:
	    		//removeAll(Collection c) remove all element from list 
	    	ArrayList<Integer>lst=new ArrayList<Integer>();
	    		mylist.removeAll(lst);
	    		break;
	    	case 12:
	    		Object[] a=mylist.toArray();
	    		break;
	    	case 13:
	    		ArrayList<Integer> lsit=new ArrayList<Integer>();
	    		mylist.addAll(1, lsit);
	    		break;
	    		
	    	}
	    }
	
	public static void main(String args[])
	{
		//Three ways to implement ArrayList constructor--1 :emptyList
	    ArrayList<Integer> list=new ArrayList<>();	
	    //2.From any other Collection
	    Stack<String> stack=new Stack();
	    ArrayList<String> list2=new ArrayList<>(stack);
	    //3.Using initial Capacity
	    ArrayList<String> list3=new ArrayList<>(10);
	    list3.add("a");
	    list3.add("b");
	    list3.add("c");
	    list3.add("d");
	    java.util.Collections.sort(list,Collections.reverseOrder());
        displayUsingForeach(list3);	    
	}
	
	
	
	
}
