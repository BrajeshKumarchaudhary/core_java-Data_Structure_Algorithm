package com.java.Problem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestClass {
	/*
	 * Sample code to perform I/O: Use either of these methods for input
	 */

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		// Write your code here
		Map<Integer, Integer> fr = new HashMap<>();
		for (int i = 0; i < N; i++) {
			if (fr.containsKey(arr[i])) {
				int c = fr.get(arr[i]);
				fr.put(arr[i], c++);
			} else {
				fr.put(arr[i], 1);
			}
		}
		int Q = in.nextInt();
		for (int i = 0; i < Q; i++) {
			int l = in.nextInt();
			int r = in.nextInt();
			printSum(fr, l, r, arr, N);
		}

	}

public static  void printSum(Map<Integer,Integer> fr,int l,int r,int arr[],int N){
    int sum=0;
    for(int i=0;i<N;i++){
       int f=fr.get(arr[i]);
       if(f>=l||f<=r){
           sum=sum+arr[i];
       }
    }
    System.out.println(sum);
}

}
