package com.java.String.Problems;

import java.util.Stack;

/*
 * print all combination can be formed replacing wild card symbol
 */
public class PrintAllStringCombination {

	// function print all string formed
	static void printAll(String p) {
		Stack<String> stack = new Stack<>();
		stack.push(p);
		int index;
		while (!stack.empty()) {
			String current = stack.pop();
			if ((index = current.indexOf('?')) != -1) {
				// replace wild character to 0 and 1
				for (char i = '0'; i <= '1'; i++) {
					current = current.substring(0, index) + i + current.substring(index + 1);
					stack.push(current);
				}
			}
			// String formed no any wild character
			else {
				System.out.println(current);
			}
		}
	}

	public static void main(String[] args) {
		String pattern = "1?11?00?1?";
		printAll(pattern);

	}

}
