package com.algorithm.Sorting;

import java.util.Arrays;

public class MergeTwoUnsortedArray {

	private static int [] doMerge(int left[],int right[]) {
		int n1=left.length;
		int n2=right.length;
		int i=0,j=0,k=0;
		int merge[]=new int[n1+n2];
//		while((i<n1)&&(j<n2)) {
//			if(left[i]<=right[j]) {
//				merge[k]=left[i];
//				i=i+1;
//			}else {
//				merge[k]=right[j];
//				j=j+1;
//			}
//			k=k+1;
//		}
		while(i<n1) {
			merge[k]=left[i];
			k++;
			i++;
		}
		while(j<n2) {
			merge[k]=right[j];
			k++;
			j++;
		}
		Arrays.sort(merge);
		return merge;
	}
	
	private static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		int left[]= {1,2,2,3,40,20,21};
		int right[]= {20,30,440,200,1};
		printArray(doMerge(left, right));
	}
}
