package com.java.Arrays;

import java.util.Arrays;
import java.util.*;

public class NegativeElementAtOneSide {

	private static void solveSided(Integer arr[]) {
		List<Integer> list=Arrays.asList(arr);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list.toString());
	}
	
	private static void rearrange(Integer a[],int n) {
		//time Complexity O(n)
		//Space complexit O(1)
		int temp;
		int j=0;
		for(int i=0;i<n;i++) {
			if(a[i]<0) {
				if(i!=j) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
				j++;
			}
		}
		int i=0;
		while(i<n) {
			System.out.println(a[i]);
			i++;
		}
	}
	
	public static void main(String[] args) {
    Integer a[]= {-19,20,-10,230,-10};
//    solveSided(a);
	rearrange(a, a.length);
	}

}
