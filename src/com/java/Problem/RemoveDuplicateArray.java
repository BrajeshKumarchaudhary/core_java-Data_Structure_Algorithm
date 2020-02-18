package com.java.Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateArray {

	public static void printUsingSet(int a[])
	{
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		Iterator<Integer> it=set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
	public static void printUsingList(int a[])
	{
	  List<Integer>	list=new ArrayList<>();
	  for(int i=0;i<a.length;i++)
	  {
		  if(!list.contains(a[i]))
		  {
			  list.add(a[i]);
		  }
	  }
	  Iterator<Integer> list2=list.iterator();
	  while(list2.hasNext())
	  {
		  System.out.println(list2.next());
	  }
	  
	}
	
	
	public static void customCode(int a[])
	{
		int result[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(!isExist(a[i],result))
			{
				result[i]=a[i];
			}
		}
	}
	public static  boolean isExist(int num,int result[])
	{
		for(int i=0;i<result.length;i++)
		{
			if(num==result[i])
			{
				return true;
		  	}
           return false;
		}
		return false;
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
