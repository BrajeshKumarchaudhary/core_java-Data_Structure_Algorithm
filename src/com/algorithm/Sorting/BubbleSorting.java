package com.algorithm.Sorting;


public class BubbleSorting {
	
	private static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	private static int [] doSortingBubble(int arr[]) {
		int n=arr.length;
		for (int i=0;i<n-1;i++) {
			for(int j=i;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int arr[]= {2,1,3,5,6,3,21,3};
		printArray(doSortingBubble(arr));
	}
}
