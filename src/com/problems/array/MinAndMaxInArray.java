package com.problems.array;

import java.util.stream.IntStream;

/**
 * @author brajesh
 * Find min and max element from array
 */
public class MinAndMaxInArray {

	public int minArray(int array[]) {
		int min=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]<min) {
				min=array[i];
			}
		}
		return min;
	}
	
	public int maxArray(int array[]) {
		int max=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		return max;
	}
	
	public int getMinArray1(int array[]) {
		return IntStream.of(array).min().getAsInt();
	}
	
	public int getMaxArray1(int array[]) {
		return IntStream.of(array).max().getAsInt();
	}
	
	public static void main(String[] args) {
		MinAndMaxInArray obj=new MinAndMaxInArray();
		System.out.println("Min---"+obj.minArray(new int[] {2,3,4,6,2,1,6}));
		System.out.println("Min---"+obj.getMinArray1(new int[] {2,3,4,6,2,1,6}));
		System.out.println("Max--"+obj.maxArray(new int[] {2,3,4,6,2,1,6}));
		System.out.println("Max--"+obj.getMaxArray1(new int[] {2,3,4,6,2,1,6}));
	}
}
