package com.java.String.Problems;

public class AddTwoArray {

	

	private static void printArray(int arr[]) {
		int n=arr.length-1;
		for (int i =n; i>=0; i--) {
			System.out.println(arr[i]);
		}
	}

	public static int add(int[] first, int[] second) {
		int result=arrayToInt(first)+arrayToInt(second);
		int temp=result;
       int arr[]=new int[first.length>second.length?first.length:second.length];
		int i=0;
       while(temp>0) {
              arr[i]=temp%10;
              temp=temp/10;
              i++;
		}
       printArray(arr);
		return result;
	}
	
	private static int arrayToInt(int ar[]) {
		int nbr = 0;
		for(int i = 0; i < ar.length;i++)
		    nbr = nbr*10+ar[i];
		return nbr;
	}
	
	public static void main(String[] args) {
		int a[] = { 1, 2, 3 ,9};
		int b[] = { 1, 2, 3, 9};
		System.out.println(add(a, b));
	}

}
