/**
 * 
 */
package com.problems.array;

/**
 * @author brajesh Given an array which consists of only 0, 1 and 2. Sort the
 *         array without using any sorting algo
 */
public class Sort012 {

	/**
	 * 
	 */
	public Sort012() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 0, 0, 2, 1, 0, 1 ,2};
		sort01(arr);
	}

	/**
	 * @param arr
	 * Simple Approach counting of 0,1,2
	 * 
	 */
	private static void sort01(int arr[]) {
		int zero_c = 0;
		int one_c = 0;
		int two_c = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				zero_c++;
			} else if (arr[i] == 1) {
				one_c++;
			} else {
				two_c++;
			}
		}
		int pos=0;
		for (int i = 0; i < zero_c; i++) {
			arr[pos] = 0;
			pos++;
		}
		for (int i =0; i < one_c; i++) {
			arr[pos] = 1;
			pos++;
		}
		for (int i =0; i < two_c; i++) {
			arr[pos] = 2;
			pos++;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(" " + arr[i]);
		}
	}

	
	/**
	 * @param arra
	 * Dutch National Flag Algorithm OR 3-way Partitioning
	 * Keep three indices low = 1, mid = 1 and high = N and there are four ranges, 1 to low (the range containing 0), 
	 * low to mid (the range containing 1), mid to high (the range containing unknown elements) and high to N (the range containing 2).
	 */
	private static void Dutch(int arr[]) {
		int low=0;
		int mid=0;
		int high=arr.length-1;
		int temp=0;
		while(mid<=high) {
			switch (arr[mid]) {
			case 0:
				temp = arr[low]; 
                arr[low] = arr[mid]; 
                arr[mid] = temp; 
                low++; 
                mid++; 
                break; 
			case 1: 
                mid++; 
                break; 
            case 2: { 
                temp = arr[mid]; 
                arr[mid] = arr[high]; 
                arr[high] = temp; 
                high--; 
                break; 
            } 				

			default:
				break;
			}
		}
	}
}
