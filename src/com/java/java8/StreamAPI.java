package com.java.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamAPI {

	public static void main(String[] args) {
//        System.out.println("Minimum element--"+getMin(new int []{1,2,5,6,80,11,23,34,98}));
//        allStatstical(new int []{1,2,5,6,80,11,23,34,98});
//		printTable(10);
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(10, 40000));
		list.add(new Employee(30, 4000));
        //filter
		List<Employee> empList=list.stream().filter(em->em.getAge()==10).collect(Collectors.toList());
        
	    Optional<String> checkNull=Optional.empty(); 
	    if(checkNull.isPresent()) {
	    	System.out.println("Exists data");
	    }
        empList.forEach(e->{
	    	 System.out.println(e.getAge());
	     });
        
        //map
        list.stream().map((emp)->{
        	emp.age=emp.age+1;
        	return emp;
        }).forEach(e->{
        	System.out.println(e.getAge());
        });
        //group by
        
	}

	/*
	 * get minimum element from array
	 */
	private static int getMin(int arr[]) {
		int min = IntStream.of(arr).min().getAsInt();
		IntStream.of(arr).distinct().sorted().limit(3).forEach(System.out::println);
		int sum = IntStream.of(arr).distinct().sorted().limit(3).sum();
		System.out.println(sum);
		IntStream.of(arr).min().ifPresent((n) -> System.out.println(n));
		return min;
	}

	/*
	 * ' get All the IntSummary
	 */
	private static void allStatstical(int arr[]) {
		IntSummaryStatistics statistics = IntStream.of(arr).summaryStatistics();
		System.out.println("Sum--" + statistics.getSum());
		System.out.println("Average--" + statistics.getAverage());
		System.out.println("count--" + statistics.getCount());
		System.out.println("Max--" + statistics.getMax());
	}

	private static void printEven(int arr[]) {
		// print Even number
		IntStream.of(arr).filter(num -> num % 2 == 0).forEach(System.out::println);
		// print Odd number
		IntStream.of(arr).filter(num -> num % 2 != 0).forEach(System.out::println);
	}

	private static void printTable(int number) {
		IntStream.range(1, 11).map(num -> num * number).forEach(System.out::println);
	}

	// work with objects
	private static void processResult(List<Employee> list) {
		list.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).limit(3).map(Employee::getAge)
				.forEach(System.out::println);
	}

}

class Employee {
	int age;
	int salary;

	public Employee(int age, int salary) {
		this.age = age;
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
