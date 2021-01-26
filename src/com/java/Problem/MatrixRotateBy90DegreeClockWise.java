package com.java.Problem;

public class MatrixRotateBy90DegreeClockWise {

	private static void rotateMatrix(int mat[][],int size) {
		for(int j=0;j<size;j++) {
			for(int i=size-1;i>=0;i--) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
    int mat[][]= {{1,2,3},{4,5,6},{7,8,9}};
    int size=3;
		System.out.println("Iitial Matrix------");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Matrix after rotation---");
		rotateMatrix(mat,size);
		}

}
