package com.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunctionalInterFace {

	
	public static void demoConsumerInterface(int data) {
		Consumer<Integer> dis=a->System.out.println(a);
		dis.accept(data);
	}
	
	
	public static void main(String[] args) {
		demoConsumerInterface(200);
		Consumer<Integer> dis=a->System.out.println(a);
		Integer [] ia = {1,2,3,4};
		List<Integer> list=Arrays.asList(ia);
		list.forEach(dis);
	}
	
	
}
