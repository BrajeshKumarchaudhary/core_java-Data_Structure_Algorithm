package com.algorithm.Sorting;

public class InsertionSort {

	private static int[] doInsertionSorting(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>0&&arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		return arr;
	}
	private static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	public static void main(String[] args) {
      int arr[]= {1,4,1,5,4,9,7,1};
      printArray(doInsertionSorting(arr));
		
	}

}
