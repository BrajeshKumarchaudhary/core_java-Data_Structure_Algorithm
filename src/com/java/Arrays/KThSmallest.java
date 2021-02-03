package com.java.Arrays;

import java.util.Arrays;

public class KThSmallest {

	public static int getSmallestElemet(int arr[], int n) {
		Arrays.sort(arr);
		return arr[n - 1];
	}

	public static int getMaxlement(int arr[], int n) {
		Arrays.sort(arr);
		return arr[arr.length - n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 1, 4, 5, 56, 67, 23 };
		System.out.print(getMaxlement(arr, 3));

	}

}
