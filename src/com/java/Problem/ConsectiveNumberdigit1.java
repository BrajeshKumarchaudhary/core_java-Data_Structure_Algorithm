package com.java.Problem;

public class ConsectiveNumberdigit1 {

	/**
	 * @param n
	 * @return
	 */
	public static  int decToBin(int n)
	{
		int i=0;
		int binary[]=new int[1000];
		while(n>0)
		{
			binary[i]=n%2;
			n=n/2;
			i++;
		}
		return check1Digit(binary);
	}
	
	/**
	 * @param arr
	 * @return
	 */
	public  static int check1Digit(int arr[])
	{
		int count=0;
		int result=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1) {
				count++;
			}
			else {
				result=Math.max(count, result);
				count=0;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----"+decToBin(33)); 
	}

}
