package com.algorithm.Searching;

/*
 * Program for Linear Search
 */
public class LinearSearch {

	// Search function
	static int search(int arr[], int value) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] == value) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 200, 230, 400, 500, 700 };
		int result = search(arr, 490);
		if (result == -1) {
			System.out.println("Element not present in given dataSet");
		} else {
			System.out.println("Element is present at position--" + result);
		}

	}

}
