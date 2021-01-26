package com.java.Problem;

import java.util.Map;
import java.util.HashMap;
import java.util.Stack;

public class BalanceParenthsis {

	private Map<Character, Character> keyMap = new HashMap<>();

	public void BalanceParenthsis() {
		
	}

	private boolean checkBalanceString(String str) {
		keyMap.put('{', '}');
		keyMap.put('[', ']');
		keyMap.put('(', ')');
		Stack<Character> stack = new Stack<>();
		char arr[]=str.toCharArray();
		boolean flag = true;
		for (int i = 0; i < arr.length; i++) {
			if (keyMap.containsKey(arr[i])) {
				stack.add(arr[i]);
			} else {
				if (keyMap.values().contains(arr[i])) {
					if ((!stack.isEmpty()) && (stack.peek() == arr[i])) {
						stack.pop();
					} else {
						return false;
					}
				} else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		BalanceParenthsis object=new BalanceParenthsis();
		if(object.checkBalanceString("{()}")) {
			System.out.println("String are Balance");
		}else {
			System.out.println("String not Balance");
		}
	}

}
