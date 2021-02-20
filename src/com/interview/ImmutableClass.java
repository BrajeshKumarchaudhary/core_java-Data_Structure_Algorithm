package com.interview;

public final class ImmutableClass {
	private String name;
	private Age age;

	public void ImmutableClass(Age age, String name) {
		// for Immutable
		this.age = age;
		Age a = new Age();
		a.setAge(this.getAge().getAge());
		age = a;

		this.name = name;

	}

	public String getName() {
		return this.name;
	}

	public Age getAge() {
		// for immutable
		Age clone = new Age();
		clone.setAge(this.age.getAge());
		return clone;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Age {

	private int age;

	public void Age(int age) {
		this.age = age;
	}

	public void Age() {

	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}
}
