package com.java.java8;

import java.util.function.Consumer;

public class ConsumerInterface {

	public static void main(String[] args) {

		Consumer<String> consumer = (str -> {
			System.out.println(str);
		});
		consumer.accept("Class");
	}
}
