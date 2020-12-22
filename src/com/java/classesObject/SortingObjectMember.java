package com.java.classesObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingObjectMember {

	public static void main(String[] args) {
       Man m0=new Man(20,"brajesh");
       Man m1=new Man(2,"brajesh");
       List<Man> m=new ArrayList<>();
       m.add(m0);
       m.add(m1);
       m.sort((Man m11,Man m2)->m11.getAge()-m2.getAge());//sorting by using age
       m.forEach(st->System.out.println(st));
       m.sort((Man mm,Man n)->mm.getName().compareTo(n.getName()));// sorting by using name
	}
}

class Man
{
	int age;
	String name;
	Man(int age,String name)
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
