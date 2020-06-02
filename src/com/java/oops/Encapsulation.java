package com.java.oops;

/*
 * Encapsulation
 */
public class Encapsulation {

	public static void main(String[] args) {
     /*
      * Encapsulation is defined as the wrapping up of data under a single unit. 
      * It is the mechanism that binds together code and the data it manipulates
      * Technically in encapsulation, the variables or data of a class is hidden from any other class and can be accessed only through any member function of own class in which they are declared.
      * Encapsulation can be achieved by: Declaring all the variables in the class as private and writing public methods in the class to set and get the values of variables.
      */
	  Student s=new Student();
	  s.setAge(20);
	  s.setName("Brajesh");
	  System.out.println(s.getName()+"  "+s.getAge());
	  //Advantages of Encapsulation:
	  /*
	   *a.Data Hiding: The user will have no idea about the inner implementation of the class.
	   *b.Increased Flexibility: We can make the variables of the class as read-only or write-only depending on our requirement.
	   *c.Reusability: Encapsulation also improves the re-usability and easy to change with new requirements
	   *d.Testing code is easy: Encapsulated code is easy to test for unit testing.
	   */
	}

}

class Student
{
	private String name;
	private int age;
	//create getter and setter to access the private value
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
