package com.java.Arrays;

public class CyclicRotateArray {

	private static void cyclicRotateByOne(int a[]) {
		int temp=a[a.length-1];
		for(int i=a.length-1;i>0;i--) {
			a[i]=a[i-1];
		}
		a[0]=temp;
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
          int a[]= {1,3,4,6};
          cyclicRotateByOne(a);
	}

}
