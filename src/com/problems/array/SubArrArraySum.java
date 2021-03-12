package com.problems.array;

public class SubArrArraySum {

	
	
	/*
	 * Brute Force Solution
	 */
	
	private static void findSubArray(int arr[],int sum) {
		for(int i=0;i<arr.length;i++) {
			int sum_arr=0;
			for(int j=i;j<arr.length;j++) {
				sum_arr=sum_arr+arr[j];
				if(sum_arr==sum) {
					System.out.println("start--"+(i+1));
					System.out.println("end--"+(j+1));
				}
			}
			
		}
		
	}
	public static void main(String[] args) {
     int arr[]= {2,3,4,67,4,2};
     findSubArray(arr, 98);
	}

}
