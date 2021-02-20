package com.interview;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import jdk.nashorn.internal.ir.CatchNode;

public class Externalizaion {

	public static void main(String[] args) {
		Person p = new Person();
		p.setId(120);
		p.setName("Brajesh Kumar");

		try {
			FileOutputStream out = new FileOutputStream("sample.txt");
			ObjectOutputStream obj = new ObjectOutputStream(out);
			obj.writeObject(p);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileInputStream inStream = new FileInputStream("sample.txt");
			ObjectInputStream in = new ObjectInputStream(inStream);
			Person p1 = (Person) in.readObject();
			System.out.println(p1.getId());
			System.out.println(p1.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/*
 * Externalization is used whenever we need to customize serialization
 * mechanism. If a class implements an Externalizable interface then, object
 * serialization will be done using writeExternal() method.
 */
class Person implements Externalizable {
	private int id;
	private String name;

	public void Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public void Person() {
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeChars(this.name);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String) in.readObject();
	}
}
