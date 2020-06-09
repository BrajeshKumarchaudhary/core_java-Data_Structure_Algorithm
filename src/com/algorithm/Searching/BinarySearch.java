package com.algorithm.Searching;

import java.util.Arrays;

/*
 * Binary Search
 */
public class BinarySearch {

	//BinarySearch
	static int binarySearch(int arr[],int l,int r,int value)
	{
		if (r >= l) { 
            int mid = l + (r - l) / 2; 
  
            // If the element is present at the 
            // middle itself 
            if (arr[mid] == value) 
                return mid; 
  
            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            if (arr[mid] > value) 
                return binarySearch(arr, l, mid - 1, value); 
  
            // Else the element can only be present 
            // in right subarray 
            return binarySearch(arr, mid + 1, r, value); 
		}
		return -1;
	}
	
	public static void main(String[] args) {
     int arr[]= {200,400,100,600,900,300,200};
     Arrays.sort(arr);
     int l=0;
     int r=arr.length-1;
     int result=binarySearch(arr,l, r,600);
     if(result==-1)
     {
    	 System.out.println("Element is not present");
     }
     else {
    	 System.out.println("Element is present--"+result);
     }
       		
	}

}
