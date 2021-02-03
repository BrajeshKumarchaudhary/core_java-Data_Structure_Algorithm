package com.java.java8;

import java.util.*;
import java.util.stream.Collectors;
public class Sequence_Parallel_Stream {

	public static void main(String[] args) {
     /*
      * Sequential Stream
      * 1. Runs on Single core of Computers.
      * 2.Performance is poor.
      * 3.Order is maintained
      * 4.OnlySingle Iteration at a time just like an for loop.
      * 5. Platform independent
      * 6.More reliable and less error. 
      */
		
	  /* Parallel Stream
	   * 1. Utilize multiple cores of CPU.
	   * 2. The performance is high.
	   * 3. Does not care about order.
	   * 4. Operates multiple iterations on available cores.
	   * 5. Less reliable and error-prone
	   * 5. platform dependent.
	   * 
	   * 
	   * 
	   * 	
	   */
		
		
		
		
		//		printByParllelStream(Arrays.asList(2,4,5,6,7,9));
		printByStream(Arrays.asList(1,2,3,4,0));
	}
	
	
	
	public static  void printByParllelStream(List<Integer> list) {
		//result not in sequence because stream processed by multiple core of CPU.
		list.parallelStream().forEach(n->System.out.println(n));
		
		//for ordered
		list.parallelStream().forEachOrdered(e->System.out.println(e));
		
		//seggegate even number
		List<Integer> evenList=list.stream().filter(n->n%2==0).collect(Collectors.toList());
		//multiply by 2 in all evenNo.
		List<Integer> doubleEvenList=evenList.stream().map(n->n*2).collect(Collectors.toList());
	}
	
	
	public static void printByStream(List<Integer> list) {
		list.stream().forEach(System.out::println);
	}

}
