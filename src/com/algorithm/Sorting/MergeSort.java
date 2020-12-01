package com.algorithm.Sorting;
 
import java.util.Arrays;

public class MergeSort {

	private static int [] doMergeSorting(int arr[]) {
		
		int n=arr.length;
		if(n<2) {
			return arr;
		}
		int mid=n/2;
		int left[]=new int [mid];
		int right[]=new int [n-mid];
		for(int i=0;i<mid-1;i++) {
			left[i]=arr[i];
		}
		for(int i=mid;i<n-1;i++) {
			right[i-mid]=arr[i];
		}
        doMergeSorting(left);
        doMergeSorting(right);
       return doMerge(left, right);
	}
	private static int [] doMerge(int left[],int right[]) {
		int n1=left.length;
		int n2=right.length;
		int i=0,j=0,k=0;
		int merge[]=new int[n1+n2];
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
	private static void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		int left[]= {1,2,2,3,40,20,21};
		print(doMergeSorting(left));

	}

}
