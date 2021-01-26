package com.java.String.Problems;

public class DeepClone {

	public static void main(String[] args) {
		Person p = new Person();
		PersonAddress addr = new PersonAddress();
		addr.setCity("Kanpur");
		addr.setPinCode(12222);

		p.setAddress(addr);
		p.setId(1);
		p.setName("Brajesh Kumar");
		PersonAddress addr1 = new PersonAddress();
		addr1.setCity("Kanpur");
		addr1.setPinCode(1222200);
		Person p1=null;
		try {
			 p1=(Person)p.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.setAddress(addr1);
		System.out.println("Person--" + p);
		System.out.println("Person--" + p1);
	}

}
