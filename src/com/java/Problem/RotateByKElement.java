package com.java.Problem;

import java.util.LinkedList;
import java.util.List;

public class RotateByKElement {

	public static void rotateUsinglist(int arr[],int r)
	{
		int temp[]=new int[r];
		for(int i=0;i<r;i++)
		{
			temp[i]=arr[i];
		}
		System.out.print(arr.length-r);
		for(int i=0;i<temp.length;i++)
		{
			arr[i]=temp[i];
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(""+arr[i]);
		}
		
	}
	public static void rotate(int arr[],int d,int n)
	{
		for(int i=0;i<d;i++)
		{
			rotateOne(arr,n);
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(""+arr[i]);
		}
		
	}
	
	
	public static void rotateOne(int arr[],int n)
	{
		int temp=arr[0];
		int i=0;
		for(i=0;i<n-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[i]=temp;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a[]= {23,34,23,56,60,100,10};
   rotate(a,2,7);
		
		
	}

}
