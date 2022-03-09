package com.java.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GroupByStreamAPI {

	public static void printGroupBy(List<String> list) {
		Map<String, List<String>> groupByMap = list.stream().collect(Collectors.groupingBy(str -> str));
		groupByMap.forEach((k, v) -> {
			System.out.println(k + "---" + v);
		});
	}

	public static void printByPartionBy(List<String> list) {
		Map<Boolean, List<String>> allList = list.stream().collect(Collectors.partitioningBy(s -> s.equals("Brajesh")));
		System.out.println(allList);
	}

	public static void printSum(List<Integer> list) {
	}

	public static void main(String[] args) {
		printGroupBy(Arrays.asList("Brajesh","Brajesh","Suresh","Suresh","Dheeraj"));
	//	printByPartionBy(Arrays.asList("Brajesh", "Brajesh", "Suresh", "Suresh", "Dheeraj"));
	}

}
