package com.java.Problem;

public class SortArray {

	public static void sortArray(int a[])
	{
		int count_1=0;
		int count_0=0;
		int count_2=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				count_0++;
			}
			if(a[i]==1)
			{
				count_1++;
			}
			if(a[i]==2)
			{
				count_2++;
			}
		}
		int i=0;
//		System.out.println("0-"+count_0);
//		System.out.println("1-"+count_1);
//		System.out.println("2-"+count_2);
		int b[]=new int [a.length];
		for( i=0;i<count_0;i++)
		{
			System.out.println(0);
		}
		for(int k=0;k<count_1;k++)
		{
			System.out.println(1);
		}
		
		for(int j=0;j<count_2;j++)
		{
		   System.out.println(2);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {0,1,2,0,1,2,0,2,2};
		sortArray(a);
		
	}

}
