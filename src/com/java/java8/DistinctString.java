package com.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctString {

	public static void main(String[] args) {
   List<String> list=Arrays.asList("Brajesh","Brajesh");
   List<String> res=list.stream().distinct().collect(Collectors.toList());
   res.forEach(s->System.out.println(s));
	}

}
