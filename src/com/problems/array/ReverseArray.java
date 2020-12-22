package com.problems.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

/**
 * @author brajesh Problem :Reverse The Array
 *
 */
public class ReverseArray<T> {

	/**
	 * @param array Simple Print the array in reverse Order
	 */
	public void reverseByMethod1(T array[]) {
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println("" + array[i]);
		}
	}

	/**
	 * @param arr
	 * Reverse using Stack
	 */
	public void reverseMethod2(T arr[]) {
		Stack<T> stack = new Stack<>();
		// push the element
		for (int i = 0; i < arr.length; i++) {
			stack.push(arr[i]);
		}
		// pop the element
		while (!stack.empty()) {
			System.out.println(stack.pop());
		}
	}
	
	/**
	 * @param array
	 */
	public void reverseMethod3(T array[]) {
		Collections.reverse(Arrays.asList(array));
		Arrays.asList(array).forEach(v->{
			System.out.println(v);
		});
		System.out.print("Reverse Array "+Arrays.toString(array));
	}
	
	/**
	 * @param array
	 * V.IMP method
	 */
	public void reverseMethod4(T array[]) {
		//Replace the first to last and same as next order
		T temp;
		int size=array.length;
		for(int i=0;i<size/2;i++) {
			temp=array[i];
			array[i]=array[size-i-1];
			array[size-i-1]=temp;
		}
		System.out.println("Reverse Array--"+Arrays.toString(array));
	}
	
	
	

	public static void main(String[] args) {
     Integer[] array= {2,1,3,6,8};
     ReverseArray<Integer> obj=new ReverseArray<>();
     obj.reverseMethod4(array);
	}
}
