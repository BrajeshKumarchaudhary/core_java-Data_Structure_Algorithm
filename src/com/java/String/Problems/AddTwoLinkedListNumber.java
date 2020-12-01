package com.java.String.Problems;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AddTwoLinkedListNumber {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(1);
		list.add(1);

		List<Integer> list2 = new LinkedList<Integer>();
		list2.add(119999);
		list2.add(1);
		list2.add(1);
		add(list, list2);
	}

	private static void add(List<Integer> asList, List<Integer> asList2) {
		int n1 = 0;
		for (int i = 0; i < asList.size(); i++) {
			int temp = asList.get(i);
			n1 = n1 * 10 + temp;
		}
		int n2 = 0;
		for (int i = 0; i < asList2.size(); i++) {
			int temp = asList2.get(i);
			n2 = n2 * 10 + temp;
		}
		int sum = n1 + n2;
		System.out.println(sum);
	}
}
