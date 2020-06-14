package com.datastructure.Arrays;

/*
 * Jagged Array
 */
public class JaggedArray {

	public static void main(String[] args) {
		/*
		 * Jagged array is array of arrays such that member arrays can be of different
		 * sizes, i.e., we can create a 2-D arrays but with variable number of columns
		 * in each row. int[][]c; c = new int[2][]; // creates 2 rows c[0] = new int[5];
		 * // 5 columns for row 0 c[1] = new int[3]; // create 3 columns for row 1
		 */
		int a[][] = new int[2][];// creates two row
		a[0] = new int[5];
		a[0] = new int[3];
		int count = 0;
		// Initializing of an jagged array
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = count++;
			}
		}
		System.out.println("Displaying the contents of an jagged array");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(" " + a[i][j]);
			}
			System.out.println();
		}
	}

}
