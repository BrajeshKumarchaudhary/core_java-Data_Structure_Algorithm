package com.java.Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class FindMaxAndMin {

	private static void findMin(Integer ar[]) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(Arrays.asList(ar));
		System.out.println("Min--" + minHeap.peek());
	}

	private static void findMax(Integer ar[]) {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
		maxHeap.addAll(Arrays.asList(ar));
		System.out.println("Max--" + maxHeap.peek());
	}

	public static void main(String[] args) {
		Integer a[] = { 1, 34, 10, 1, -19 };
		findMin(a);
		findMax(a);
	}

}
