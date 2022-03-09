package com.datastructure.Arrays;

import java.util.ArrayList;
import java.util.List;

/*
 * Array in java
 * One Dimensional array
 */
public class ArraysInJava {

	public static void main(String[] args) {

		// Instantiating an Array in Java
		int a[];// decalaration
		/*
		 * When an array is declared, only a reference of array is created. To actually
		 * create or give memory to array, you create an array like this:The general
		 * form of new as it applies to one-dimensional arrays appears as follows:
		 */
		a = new int[20];// allocating memory to array varriable with default value

		// Array Literal
		// In a situation, where the size of the array and variables of array are
		// already known, array literals can be used.
		int a1[] = new int[] { 20, 30, 40, 50 };
		// or
		int a11[] = { 20, 30, 40 };// latest version

		// Accessing Java Array Elements using for Loop
		for (int i = 0; i < a11.length; i++) {
			System.out.println(a11[i]);
		}
		// using foreach
		for (int i : a11) {
			System.out.println(a11[1]);
		}
		// Arrays of Of objects
		Student list[] = new Student[20];
		list[0] = new Student("Brajesh", 20);
		list[1] = new Student("Maneesh Kumar", 21);
		for (Student student : list) {
			System.out.println(student.getName() + " " + student.getAge());
		}
	}

}

class Student {
	private String name;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public String getName() {
		return this.name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

}