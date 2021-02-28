package com.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MyCode {

	public static void main(String[] args) {
		System.out.println("Hello Java");
	    List<Integer> list=Arrays.asList(1,2,3,3,45,89);
	    //Filter function Expecting Predicate InterFace Implementations.
	    Predicate<Integer> isTrue=(n->{
	    	return n%2==0;
	    });
	    List<Integer> evenList=list.stream().filter(n->isTrue.test(n)).collect(Collectors.toList());
	    //for Each Function Expecting Consumer InterFace.
	    Consumer<Integer> consumer=(n->{
//	    	System.out.println(n);
	    });
	    
	    evenList.stream().forEach(t->consumer.accept(t));
	    
	    List<Integer> dList=list.stream().distinct().collect(Collectors.toList());
	      dList.stream().forEach(n->{
//	    	  System.out.println(n);
	      });
	    
	      //Terminal opertaion here count.
	    list.stream().count();
	      
	      
	    Supplier<Double> supplier=()->{
	    	return Math.random();
	    };
//	    System.out.println(supplier.get());
	    
	    //Int Stream
	    IntStream.range(1, 10).forEach(n->{
//	    	System.out.println(n);
	    });
	    
	    //Int Stream with skip
	    
	    IntStream.range(1, 10).skip(5).forEach(n->{
	    	System.out.println(n);
	    });
	    
	    
	    
	    
	    
	}

}
