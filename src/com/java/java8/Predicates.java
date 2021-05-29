package com.java.java8;

import java.util.function.Predicate;

public class Predicates {

	public static void main(String[] args) {
     Predicate<String> s=(str)->{
    	 return str==null;
     };
	
     System.out.println(s.test(null));
     System.out.println(s.test("Brajesh"));
	}	
}
