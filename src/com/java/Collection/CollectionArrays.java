package com.java.Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CollectionArrays {

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer a[]=new Integer[3];
		a[0]=new Integer(20);
		a[1]=new Integer(31);
		a[2]=new Integer(31);
		System.out.println("The arrays in ascending order:");
		Arrays.sort(a,new Ascend());
		for (int i = 0; i < a.length; i++) {
			System.out.println(""+a[i]);
		}
		System.out.println("The arrays in Descending order:");
		Arrays.sort(a,new Descend());
		for (int i = 0; i < a.length; i++) {
			System.out.println(""+a[i]);
		}
		
}

}


class Ascend implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}
	
}

class Descend implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
}


