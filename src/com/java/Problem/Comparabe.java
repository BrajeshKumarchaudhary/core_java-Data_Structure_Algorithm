package com.java.Problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Comparabe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer(20, "brajesh");
		Customer c2 = new Customer(22, "Sonu");
		Customer c3 = new Customer(19, "Prakash");
		List<Customer> list = new ArrayList<>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		Collections.sort((List<Customer>) list);
//		Collections.sort(list, (o1, o2) -> {
//			return o1.getName().compareTo(o2.getName());
//		});
		System.out.print(list);

	}

}

class Customer implements Comparable<Customer> {

	int age;
	String name;

	public Customer(int age, String name) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return ((Customer) o).getName().compareTo(this.getName());
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.age + " " + this.name;
	}
}