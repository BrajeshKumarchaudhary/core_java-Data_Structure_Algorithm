package com.java.Problem;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

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
	
	public static double getMode(int a[])
	{
		int count=0;
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<a.length;i++)
		{
			if(map.containsKey(a[i]))
			{
				int temp=map.get(a[i]);
				map.put(a[i], ++temp);
			}
			else {
				map.put(a[i], 1);
			}
		}
		int maxvalue=Collections.max(map.values());
		for(Entry<Integer,Integer> entry: map.entrySet())
		{
			if(entry.getValue()==maxvalue)
			{
				count=entry.getKey();
			}
		}
		return count;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[]= {1, 3, 4, 2, 6, 5, 8, 7,7,8,8};
        System.out.println("The mean of array is "+getMean(a));
        System.out.println("The meadian of array "+getMedian (a));
        System.out.println("The mode of array "+getMode(a));
	}
}
