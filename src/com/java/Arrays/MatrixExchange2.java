package com.java.Arrays;

public class MatrixExchange2 {

	
	public static void columnChange(int a[][],int c,int r)
	{
		for(int i=0;i<r;i++)
		{
			int temp=a[i][0];
			a[i][0]=a[i][c-1];
			a[i][c-1]=temp;
		}
	}
	
	public static void printElement(int a[][],int c,int r)
	{
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(""+a[i][j]);
			}
			System.out.println("");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
