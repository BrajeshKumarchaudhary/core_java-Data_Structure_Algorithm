package com.java.Problem;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {

		List<Emp> empList = new LinkedList<>();
		empList.add(new Emp("a", 20));
		empList.add(new Emp("k", 1));
		empList.add(new Emp("b", 8));
		Collections.sort(empList, new EmpSortByAge());
		empList.forEach(e -> {
			System.out.println(e);
		});
		empList.forEach(e -> {
			System.out.println(e.toString());
		});
	}

}

class Emp {
	private String name;
	private int age;

	public Emp(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + "]";
	}

}

class EmpSortByName implements Comparator<Emp> {

	
	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

class EmpSortByAge implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.getAge() - o2.getAge();
	}

}