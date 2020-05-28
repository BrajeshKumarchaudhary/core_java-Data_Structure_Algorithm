package com.java.Collection;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
/*
 * In this program we are making list of Student having id,name,address,phone.
 */
public class MyArrayList {

	public static void main(String[] args) {
		//creating a List of type Student
		ArrayList<Student> st=new ArrayList<>();
		//Adding Student to list
		st.add(new Student(1, "Brajesh kumar","kanpur", new BigInteger("9956239356")));
       		
	}

/*
 * Traversing of ArrayList
 */
public static void printList(ArrayList<Student> list) {
      //Using Lamda function
	   list.forEach(st->System.out.println(st));
	  // Using Java8 Stream
	   list.stream().forEach(st->System.out.println(st));
	   //Using Iterator
	   Iterator<Student> it=list.iterator();
	   while(it.hasNext())
	   {
		   System.out.println(it.next());
	   }
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