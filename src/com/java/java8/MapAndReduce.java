package com.java.java8;

import java.util.*;

public class MapAndReduce {

	public static void main(String[] args) {

		List<Integer> numbers=Arrays.asList(1,4,6,3,2,7);
		OptionalInt sum=numbers.stream().mapToInt(n->n).reduce(Integer::sum);
         System.out.println("Sum--"+sum.getAsInt());
       int sum2=numbers.stream().reduce(0,(a,b)->a+b);
       System.out.println(sum2);
	}

}
