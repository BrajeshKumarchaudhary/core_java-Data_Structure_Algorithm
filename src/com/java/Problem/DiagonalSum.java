package com.java.Problem;

public class DiagonalSum {

	private static int diagonalSum(int mat[][]) {
		int leftdiagonal=0;
		int rightdiagonal=0;
		
		for(int i=0,j=mat[0].length-1;i<mat[0].length;i++,j--) {
			leftdiagonal=leftdiagonal+mat[i][i];
			rightdiagonal=rightdiagonal+mat[i][j];
		}
		return leftdiagonal+rightdiagonal;
	}
	
	private static int diagonalProduct(int mat[][]) {
		int leftdiagonal=0;
		int rightdiagonal=0;
		
		for(int i=0,j=mat[0].length-1;i<mat[0].length;i++,j--) {
			leftdiagonal=leftdiagonal+mat[i][i];
			rightdiagonal=rightdiagonal+mat[i][j];
		}
		return (leftdiagonal*rightdiagonal);
	}
	
	
	private static int getLeftDiagonalSum(int mat[][]) {
		int leftdiagonal=0;
		
		for(int i=0;i<mat[0].length;i++) {
			leftdiagonal=leftdiagonal+mat[i][i];
		}
		return leftdiagonal;
	}
	private static int getRightDiagonal(int mat[][]) {
		int rightdiagonal=0;
		
		for(int i=0,j=mat[0].length-1;i<mat[0].length;i++,j--) {
			rightdiagonal=rightdiagonal+mat[i][j];
		}
		return rightdiagonal;
	}
	
	
	public static void main(String[] args) {

		int matr[][]= {{1,2,3},{1,2,3},{1,2,3}};
		System.out.println("The diagonal sum--"+diagonalSum(matr));
		System.out.println("The diagonal product--"+diagonalProduct(matr));
	}

}
