package com.java.java8;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Stream {

	public static void main(String[] args) {

		People p1 = new People("Brajesh Kumar", 123);
		People p2 = new People("Brajesh Kumar", 123);
		People p3 = new People("Brajesh Kumar", 123);
		People p4 = new People("Brajesh Kumar", 123);
		List<People> all = new LinkedList<>();
		all.add(p4);
		all.add(p3);
		all.add(p3);
		all.add(p1);
		all.stream().filter(n -> n.getId() > 120).map(People::getName).distinct().sorted().collect(Collectors.toList());

	}

}
