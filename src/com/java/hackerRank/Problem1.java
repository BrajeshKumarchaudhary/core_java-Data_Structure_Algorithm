package com.java.hackerRank;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of M:");
		int M = sc.nextInt();
		System.out.println("Enter the value of L:");
		int L = sc.nextInt();
		List<Integer> list = new LinkedList<>();
		for (int i = 0; i < L; i++) {
			int number = sc.nextInt();
			list.add(number);
		}
		System.out.println("List size "+list.size());
		int pos = (list.size()) - M;
		if (pos > 0) {
			System.out.println(list.get(pos));
		} else {
			System.out.println("NIL");
		}
	}

}
