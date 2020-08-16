package com.java.java8;

import java.util.function.Function;

public class FunctionInterFace {
	
	private static int findLength(String str) {
		Function<String,Integer> fun=(value)->{
			return value.length();
		};
		return fun.apply(str);
	}
public static void main(String[] args) {
	
	System.out.println(findLength("Brajesh"));
}
}
