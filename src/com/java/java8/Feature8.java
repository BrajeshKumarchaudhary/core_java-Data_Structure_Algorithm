package com.java.java8;

import java.time.Clock;
import java.time.Instant;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
public class Feature8 {
   /*forEach() method in Iterable interface
   *default and static methods in Interfaces
   *Functional Interfaces and Lambda Expressions
   *Java Stream API for Bulk Data Operations on Collections
   *Java Time API
   *Collection API improvements
   *Concurrency API improvements
   *Java IO improvements
   *Miscellaneous Core API improvements
 * 
 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		remove_duplicate();
//		SequentialVSParallelStream();
//		mapWithStream();
		Clock cl=Clock.systemDefaultZone();
		long millls=cl.millis();
		System.out.println(millls);
		Instant instant = cl.instant();
		Date legacyDate = Date.from(instant);   // legacy java.util.Date
		System.out.println(legacyDate);
	}

	
	//Stream APi
	public static void remove_duplicate()
	{
		List<String> list=new ArrayList<>();
		list.add("brajesh kumar");
		list.add("bhagwan");
		list.add("chawla");
		list.add("divakar");
		//Filter
		//list.stream().filter(s->s.startsWith("b")).forEach(st->System.out.println(st));
       //sorted
		//list.stream().sorted().forEach(s->System.out.println(s));
		//map
		list.stream().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		int max = 1000000;
		List<String> values = new ArrayList<>(max);
		for (int i = 0; i < max; i++) {
		    UUID uuid = UUID.randomUUID();
		    values.add(uuid.toString());
		}
	}
	public static void SequentialVSParallelStream()
	{
		long t0=System.nanoTime();
	  List<String> list=Arrays.asList("brajesh","Ankit","Govind","Maneesh");
	  list.stream().sorted().forEach(st->System.out.println(st));
	  long t1=System.nanoTime();
	  long mills =TimeUnit.NANOSECONDS.toMillis(t1-t0);
	  System.out.println(String.format("sequential sort took: %d ms", mills));
	  
	  long t2=System.nanoTime();
	  list.parallelStream().sorted().forEach(st->System.out.println(st));
	  long t3=System.nanoTime();
	  long mills1 =TimeUnit.NANOSECONDS.toMillis(t3-t2);
	  System.out.println(String.format("Parrallel sort took: %d ms", mills1));
	  
	}
	
	public static  void mapWithStream()
	{
		Map<String,String> map=new HashMap<>();
		map.put("a", "brajeshKumar");
		map.put("b", "Ankit");
		map.put("c", "Maneesh");
		map.put("d", "Dheeraj");
//		map.keySet().stream().forEach(st->System.out.println(st));	
//		map.values().stream().forEach(st->System.out.println(st));
//		map.keySet().stream().forEach(st->System.out.println(st));
		map.entrySet().stream().forEach(v->System.out.println(v));
		
	}
	
	
	
}
