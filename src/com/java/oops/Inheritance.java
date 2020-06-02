package com.java.oops;
/*
 * Inheritance
 */
public class Inheritance {

	public static void main(String[] args) {
     /*
      *It is the mechanism in java by which one class is allow to inherit the features(fields and methods) of another class.
      *Super Class: The class whose features are inherited is known as super class(or a base class or a parent class).
      *Sub Class: The class that inherits the other class is known as sub class(or a derived class, extended class, or child class).
      *Reusability: Inheritance supports the concept of “reusability”, i.e. when we want to create a new class and there is already a class that includes some of the code that we want,
      *The keyword used for inheritance is extends.
      */
		
		Sonu s=new Sonu("Sood",20, "Tamil");
		System.out.println(s.getName()+" "+s.getAge()+" "+s.getLanguage());
		//Types of Inheritance in Java
		/*
		 * a.Single Inheritance : In single inheritance, subclasses inherit the features of one superclass
		 * b.Multilevel Inheritance : In Multilevel Inheritance, a derived class will be inheriting a base class and as well as the derived class also act as the base class to other
		 * c.Hierarchical Inheritance : In Hierarchical Inheritance, one class serves as a superclass (base class) for more than one sub class
		 * d.Multiple Inheritance (Through Interfaces) : In Multiple inheritance ,one class can have more than one superclass and inherit features from all parent classes.
		 * e.Hybrid Inheritance(Through Interfaces) : It is a mix of two or more of the above types of inheritance. Since java doesn’t support multiple inheritance with classes
		 */
		//Important facts about inheritance in Java
		/*
		 * a.Default superclass: Except Object class, which has no superclass, every class has one and only one direct superclass (single inheritance). In the absence of any other explicit superclass, every class is implicitly a subclass of Object class.
		 * b.Superclass can only be one: A superclass can have any number of subclasses. But a subclass can have only one superclass.
		 * c.Private member inheritance: A subclass does not inherit the private members of its parent class. However, if the superclass has public or protected methods(like getters and setters) for accessing its private fields, these can also be used by the subclass.
		 */
		
		//What all can be done in a Subclass?
		/*
		 *The inherited fields can be used directly, just like any other fields
		 *We can declare new fields in the subclass that are not in the superclass.
         *The inherited methods can be used directly as they are.
         *
		 */
		
	}

}

class Person
{
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
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

class Sonu extends Person
{
     private String language;
	public Sonu(String name, int age,String lang) {
		super(name, age);
		this.language=lang;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
}
