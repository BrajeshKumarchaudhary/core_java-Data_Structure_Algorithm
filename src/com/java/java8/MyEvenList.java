package com.java.java8;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class MyCode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the List size of Numbers.");
		int size = sc.nextInt();
		List<Integer> list = new LinkedList<>();
		for (int i = 0; i < size; i++) {
			list.add(sc.nextInt());
		}
		List<Integer> evenList = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		evenList.forEach(n -> {
			System.out.println(n);
		});
	}
}
