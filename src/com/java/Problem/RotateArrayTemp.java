package com.java.Problem;

public class RotateArrayTemp {

	public static void rotateTemp(int a[], int d) {
		int temp[] = new int[d];
		for (int i = 0; i < d; i++) {
			temp[i] = a[i];
		}
		int i = 0;
		for (int k = 0; k < d; k++) {
			for (i = 0; i < a.length - 1; i++) {
				a[i] = a[i + 1];
			}
			a[i] = temp[k];
		}
		for (int k = 0; k < a.length; k++) {
			System.out.println("" + a[k]);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		int d = 2;
		rotateTemp(a, d);

	}

}
