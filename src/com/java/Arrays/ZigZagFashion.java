package com.java.Arrays;

public class ZigZagFashion {

	/*
	 * Print Element in this fashion a<b>c<d>e
	 */
	private static void printZigZag(int a[]) {
		boolean flag = true;
		for (int i = 0; i < a.length - 2; i++) {
			if (flag) {// < expected
				if (a[i] > a[i + 1]) {
					// swap
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}

			} else {
				if (a[i] < a[i + 1]) {// > expected
					// swap
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}
			}
			// flip flag
			flag = !flag;
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println("" + a[i]);
		}
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 4, 3, 7, 8, 6, 2, 1 };
		printZigZag(arr);
	}

}
