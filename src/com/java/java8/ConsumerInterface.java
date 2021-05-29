package com.java.java8;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class ConsumerInterface {

	public static void main(String[] args) {

		Consumer<String> consumer = (str -> {
			System.out.println(str);
		});
		Function<Integer, Integer> fun = (n -> {
			return n * n;
		});
		consumer.accept("Class");
		List<Integer> list = new LinkedList<>();
		list.stream().map(n -> fun.apply(n)).forEach(i -> {

		});
	}
}
