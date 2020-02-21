package com.java.Collection;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Character> queue=new LinkedList<Character>();
		String str="Knapur";
		char arr[]=str.toCharArray();
		for (char c : arr) {
			queue.add(c);
		}
		System.out.print(queue.remove());
		
	}

}
