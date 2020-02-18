package com.java.Arrays;

public class SomeChange {

	public static void change(int arr[],int n)
	{
		int t[]=new int [n];
		for(int i=0;i<n-2;i++)
		{
			int temp=arr[i];
			t[i]=arr[i+2];
			t[i+2]=temp;
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
