package com.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMapAndFlatMapAPI {

	/**
	 * @param list map method is used for data transformation stream to stream. it
	 *             is used for one to one mapping.
	 * 
	 */
	public static void mapMethod(List<Integer> list) {
		List<Integer> newList = list.stream().map(n -> n * 10).collect(Collectors.toList());
		System.out.println(newList);
	}

	/**
	 * @param list
	 * flatMap method is used for map with flattering of data.
	 * it is used for one to many Mapping.
	 * it is transform value of stream of stream value. 
	 */  
	public static void flatMap(List<Man> list) {
	 List<String> phones=list.stream().flatMap(m->m.getPhones().stream()).collect(Collectors.toList());
	 System.out.println(phones);
	}
	
	
	public static List<Man> getManList(){
		return Stream.of(new Man(1,"brajesh", Arrays.asList("1233","288989"))).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		//mapMethod(Arrays.asList(2, 3, 4, 5));
		flatMap(getManList());
	}

}
