package com.java.java8;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyUsingStreamAPI {

	/**
	 * @param str
	 * Step1:Convert String to charArray
	 */
	public static void printFrequency(String str) {
		char arr[] = str.toCharArray();
		List<Character> listChar = new LinkedList<>();
		for (char c : arr) {
			listChar.add(c);
		}
		Map<Character, List<Character>> mapFreq = listChar.stream().collect(Collectors.groupingBy(w -> w));
		mapFreq.forEach((k, v) -> {
			System.out.println(k + "=== " + v.size());
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFrequency("BrajjeshB");
	}

}
