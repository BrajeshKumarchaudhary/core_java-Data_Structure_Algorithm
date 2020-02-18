package com.java.Collection;

import java.math.BigInteger;
import java.util.ArrayList;

public class MyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> st=new ArrayList<>();
		st.add(new Student(1, "Brajesh kumar","kanpur", new BigInteger("9956230356")));
       System.out.print(st);		
	}

}


class Student
{
	int id;
	String name;
	String address;
	public BigInteger phone;
	public Student(int id, String name, String address, BigInteger bigInteger) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = bigInteger;
	}

	
	public int getId()
	{
		return this.id;
	}
	public String getName()
	{
		return this.name;
	}
	public BigInteger getPhone()
	{
		return this.phone;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAddress(String add)
	{
     this.address=add;		
	}
	
	public void setPhone(BigInteger phone)
	{
				this.phone=phone;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}
	
}