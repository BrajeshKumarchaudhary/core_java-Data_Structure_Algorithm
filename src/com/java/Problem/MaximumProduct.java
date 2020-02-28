package com.java.Problem;

import java.util.Arrays;

public class MaximumProduct {
   
	public static void printMaxProductPair(int a[])
	{
		int p1=a[0];
		int p2=a[1];
		for(int i=0;i<a.length;i++)
		{ 
			for(int j=i+1;j<a.length;j++)
			{
				int prdct=a[i]*a[j];
				if(prdct>(p1*p2))
				{
					p1=a[i];
					p2=a[j];
				}
			}
		}
		
		System.out.println("The Max Product is "+p1*p2);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,4,1,5};
		printMaxProductPair(a);
	}

}
