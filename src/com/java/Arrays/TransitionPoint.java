package com.java.Arrays;

public class TransitionPoint {

	public static int countTransitionPoint(int arr[],int n)
	{
		int count=0;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]==0&&arr[i+1]==1)
			{
				count++;
			}
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,1,0,1,0,0,0,1,1};
		System.out.print(countTransitionPoint(arr, arr.length));
	}

}
