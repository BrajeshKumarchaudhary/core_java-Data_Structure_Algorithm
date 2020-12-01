package com.java.Problem;

import java.util.Arrays;
import java.util.List;

public class DiagonalDiff {

	public static int diagonalDifference(List<List<Integer>> arr) {
		int leftdiagonal = 0, rightdiagonal = 0;
		for(int i = 0, j = arr.get(0).size()-1; i < arr.get(0).size(); i++, j--){
		        leftdiagonal = leftdiagonal + arr.get(i).get(i);
		        rightdiagonal = rightdiagonal + arr.get(i).get(j);
		    }
		    return Math.abs(leftdiagonal - rightdiagonal);
		    }
	    
	
	public static void main(String[] args) {
		List<List<Integer>> data=Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(1,2,3),Arrays.asList(1,2,3));
		System.out.println("The diagonal Difference is ---"+diagonalDifference(data));

	}

}
