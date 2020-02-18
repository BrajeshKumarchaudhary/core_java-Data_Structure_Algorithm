package com.java.searching;

public class LinearSearching {

	public static int linearsearch(int arr[],int number)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==number)
			{
				return i;	
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,3,4,5,6,7,8,9,34};
		int b=linearsearch(a,60);
		if(b!=-1)
		{
			System.out.print("Element found at =="+b);
		}
		else
		{
			System.out.print("Element is not found");
		}

	}

}
