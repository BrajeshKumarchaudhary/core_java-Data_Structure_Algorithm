package com.problems.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author brajesh
 * Find the "Kth" max and min element of an array 
 */
public class FindKthMinAndMax {

	
	//Simple approach using sorting .
	public static int getKthMin(int array[],int k) {
		Arrays.sort(array);
		return array[k-1];
	}
	
	
	public static int getKthMax(int array[],int k) {
		Arrays.sort(array);
		return array[array.length-k];
	}
	
	 // Function to find the K'th smallest element in the
    // array using max-heap
	
	public static int findKthSamllestElement(List<Integer> A,int k) {
        // create a max-heap using PriorityQueue class and
        // insert first k elements of the array into the heap
		  PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
	        pq.addAll(A.subList(0, k));
	        //do remaining elements
	     for(int i=k;i<A.size();i++) {
	    	 if(A.get(i)<pq.peek()) {
	    		 pq.poll();
	    		 pq.add(A.get(i));
	    	 }
	     }
	        return pq.peek();
	}
	
	 // Function to find the K'th smallest element in the
    // array using max-heap
	
	public static int findKthMaxElement(List<Integer> A,int k) {
        // create a max-heap using PriorityQueue class and
        // insert first all elements into heap
		//pop out kth element from queue and return peek value;
		  PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		  pq.addAll(A);
		  while(--k>0) {
			  pq.poll();
		  }
	        return pq.peek();
	}
	
	
	// Function to find the K'th smallest element in the
    // array using min-heap
    public static int findKthSmallest(List<Integer> A, int k)
    {
        // create an empty min-heap and initialize it with all input elements
        PriorityQueue<Integer> pq = new PriorityQueue<>(A);
 
        // pop from min-heap exactly (k-1) times
        while (--k > 0) {
            pq.poll();
        }
 
        // return the root of min-heap
        return pq.peek();
    }
	public static void main(String[] args) {
		System.out.println("Min--"+FindKthMinAndMax.findKthSmallest(Arrays.asList(1,4,5,2,6),2));
		System.out.println("Max--"+FindKthMinAndMax.findKthMaxElement(Arrays.asList(1,4,50,2,6),3));
	}
	
}
