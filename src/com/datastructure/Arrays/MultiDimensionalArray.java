package com.datastructure.Arrays;

/*
 * Multidimensional Array
 */
public class MultiDimensionalArray {

	public static void main(String[] args) {
		/*
		 * Multidimensional arrays are arrays of arrays with each element of the array
		 * holding the reference of other array. These are also known as Jagged Arrays.
		 * A multidimensional array is created by appending one set of square brackets
		 * ([]) per dimension.
		 */
		int[][] intArray = new int[10][20]; // a 2D array or matrix
		int[][][] intArray2 = new int[10][20][10]; // a 3D array

		int twod[][] = { { 2, 3, 4 }, { 3, 4, 5 }, { 3, 4, 5 } };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(" " + twod[i][j]);
			}
			System.out.println();
		}
	}

}
