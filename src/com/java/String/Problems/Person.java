package com.java.String.Problems;

public class Person implements Cloneable {
	private int id;
	private String name;
	private PersonAddress address;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public void setAddress(PersonAddress addr) {
		this.address = addr;
	}

	public PersonAddress getAddress() {
		return this.address;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//for Deep Cloning.
		Person p=(Person) super.clone();
		p.setAddress((PersonAddress)super.clone());
		return p;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
