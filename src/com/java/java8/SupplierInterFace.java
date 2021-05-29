package com.java.java8;

import java.util.function.Supplier;

public class SupplierInterFace {

	public static void main(String[] args) {

		/*
		 * The Supplier Interface is a part of the java.util.function package which has
		 * been introduced since Java 8, to implement functional programming in Java. It
		 * represents a function which does not take in any argument but produces a
		 * value of type T.
		 */

		Supplier<String> sup = (() -> {
			return "Brajesh";
		});
		System.out.println(sup.get());
	}

}
