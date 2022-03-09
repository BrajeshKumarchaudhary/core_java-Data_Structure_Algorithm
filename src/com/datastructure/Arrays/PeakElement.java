package com.datastructure.Arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PeakElement {
/*
 * Given an array of integers. Find a peak element in it. An array element is a peak if it is NOT smaller than its neighbours. 
 * For corner elements, we need to consider only one neighbour.
 */
	
	public static int findPeakElement(List<Integer> list,int size) {
		if(size==1) {
			return list.get(0);
		}else if(list.get(0)>list.get(1)) {
			return list.get(0);
		}else {
			for(int i=1;i<size-1;i++) {
				if((list.get(i)>=list.get(i-1))&&(list.get(i)>=list.get(i+1))) {
					return list.get(i);
				}
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1, 3, 20, 4, 1, 0);
		int arr[]= {};
		int size=list.size();
       System.out.println(findPeakElement(list, size));
	}

}
