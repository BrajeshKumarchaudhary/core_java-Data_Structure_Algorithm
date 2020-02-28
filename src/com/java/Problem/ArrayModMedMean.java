package com.java.Problem;

import java.util.Arrays;

public class ArrayModMedMean {

	public static double getMean(int a[])
	{
		 int sum = 0; 
		 int n=a.length;
	        for (int i = 0; i < n; i++)  
	            sum += a[i]; 
	      
	        return (double)sum / (double)n; 
	}
	public static double getMedian(int a[])
	{
		// First we sort the array 
        Arrays.sort(a); 
        int n=a.length;
  
        // check for even case 
        if (n % 2 != 0) 
        return (double)a[n / 2]; 
      
        return (double)(a[(n - 1) / 2] + a[n / 2]) / 2.0;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[]= {1, 3, 4, 2, 6, 5, 8, 7};
        System.out.println("The mean of array is "+getMean(a));
        System.out.println("The meadian of array "+getMedian (a));
	}

}
