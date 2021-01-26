package com.problems.array;

import java.util.Arrays;

/**
 * @author brajesh
 * problem :Move all the negative elements to one side of the array 
 *
 */
public class NegativeArrange {

	public NegativeArrange() {
	}

	public static void main(String[] args) {
    int arr[]= {-4,-3,4,9,-3};
      rearrange(arr);
	}

	private static void rearrange(int [] arr) {
       int j=0;int temp=0;
       for(int i=0;i<arr.length;i++) {
    	   if(arr[i]<0) {
    		   if(i!=j) {
    			   temp=arr[i];
    			   arr[i]=arr[j];
    			   arr[j]=temp;
    		   }
    		   j++;
    	   }
       }
       for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]+" ");
	}
	}
}
