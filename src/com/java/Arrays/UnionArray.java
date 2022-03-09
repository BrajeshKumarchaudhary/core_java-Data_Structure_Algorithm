package com.java.Arrays;

import java.util.HashSet;
import java.util.Set;

public class UnionArray {

	// Method 1 using Set
	private static void getUnion(Integer a[], Integer a2[]) {
		Set<Integer> resultSet = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			resultSet.add(a[i]);
		}
		for (int i = 0; i < a2.length; i++) {
			resultSet.add(a2[i]);
		}

		for (Integer integer : resultSet) {
			System.out.println(integer);
		}

	}

	private static void getInterSection(Integer a[], Integer a1[]) {
		System.out.println("=======================================");

		Set<Integer> resultSet = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			resultSet.add(a[i]);
		}
		for (int i = 0; i < a1.length; i++) {
			if (resultSet.contains(a1[i])) {
				System.out.println(a1[i]);
			}
		}
	}

	/*
	 * Method 2 Method 2 (Naive) Union:
	 * 
	 * 1.Initialize union U as empty. 
	 * 2.Copy all elements of the first array to U.
	 * 3.Do the following for every element x of the second array: If x is not
	 *            present in the first array, then copy x to U. 
	 * 4. Return U.
	 * 
	 * Intersection:
	 * 
	 * 1.Initialize intersection I as empty. 
	 * 2.Do the following for every element x of the first array 
	 * 3.If x is present in the second array, then copy x to I.
	 * 4. Return I.
	 */

	public static void main(String[] args) {
		Integer a[] = { 2, 4, 5, 8 };
		Integer a2[] = { 1, 4, 8, 9, 10 };
		getUnion(a, a2);
		getInterSection(a, a2);
	}

}
