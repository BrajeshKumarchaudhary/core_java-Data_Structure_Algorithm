package com.java.String.Problems;

import java.util.StringTokenizer;


import java.util.*;

public class ReverseWordsInString {

	public static void main(String[] args) {
		String str = "I am with very complex solution.";
		StringTokenizer st = new StringTokenizer(str);
		List<String> allString = new ArrayList<>();
		while (st.hasMoreElements()) {
			allString.add(st.nextToken());
		}
		for (int i = allString.size() - 1; i >= 0; i--) {
			System.out.println(allString.get(i));
		}
	}

}
