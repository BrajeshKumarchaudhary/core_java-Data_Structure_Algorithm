package com.java.Problem;

public class PrintDiagolnalSum {

	public static void printSum(int a[][],String type)
	{
		int sum=0;
		if(type=="left") {
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i][i];
		}
		}
		else
		{
			int j=a.length-1;
			for(int i=0;i<a.length;i++)
			{
				sum=sum+a[i][j--];
			}
		}
		System.out.println(type+"sum="+sum);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[][]= {{2,3,4},{2,3,4},{2,3,5}};
     printSum(a, "left");
     printSum(a, "right");
	}

}
