package com.java.Problem;

import java.util.stream.IntStream;

public class ArraySumLast {

	    public static void printLastSum(int a[])
	    {
	    	int sum=0;
	    	for(int i=0;i<a.length;i++)
	    	{
             sum=sum+a[i];	    	
	    	}
	    	int i=0;
	    	for(i=0;i<a.length-1;i++)
	    	{
	    	
	    		a[i]=a[i+1];
	    	}
	    	a[i]=sum;
	    	for(int k=0;k<a.length;k++)
	    	{
	    		System.out.print(" "+a[k]);
	    	}
	    }
	    
	    public static void printLastSumMethod2(int arr[]) {
	    	int sum=IntStream.of(arr).sum();
	    	System.out.println();
	    	for (int i = 1; i < arr.length; i++) {
				System.out.print(" "+arr[i]);
			}
	    	System.out.println(" "+sum);
	    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5};
//		printLastSum(a);
		printLastSumMethod2(a);
		
		
	}

}
