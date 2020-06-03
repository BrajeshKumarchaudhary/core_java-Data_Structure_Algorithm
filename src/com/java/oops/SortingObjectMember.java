package com.java.oops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingObjectMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Man1 m0=new Man1(20,"brajesh");
       Man1 m1=new Man1(2,"brajesh");
       List<Man1> m=new ArrayList<>();
       m.add(m0);
       m.add(m1);
       m.sort((Man1 m11,Man1 m2)->m11.getAge()-m2.getAge());//sorting by using age
       m.forEach(st->System.out.println(st));
       m.sort((Man1 mm,Man1 n)->mm.getName().compareTo(n.getName()));// sorting by using name
	}
}

class Man1
{
	int age;
	String name;
	Man1(int age,String name)
	{
		this.age=age;
		this.name=name;
		
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
		return "Man [age=" + age + ", name=" + name + "]";
	}
	
}
