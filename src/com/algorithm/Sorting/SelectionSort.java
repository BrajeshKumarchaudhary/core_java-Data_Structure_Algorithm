package com.algorithm.Sorting;

public class SelectionSort {

	private static int [] doSorting(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			//swap the element
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		return arr;
		
	}
	private static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	public static void main(String[] args) {
       int arr []= {2,3,1,0,67,330,11,1};
       printArray(doSorting(arr));

	}

}
