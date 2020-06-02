package com.java.oops;
/*
 * Abstraction
 */
public class Abstraction {

	public static void main(String[] args) {
      /*
       *Show the functionalities and hide the complexity
       *In java, abstraction is achieved by interfaces and abstract classes.
       */
		
		//Abstract classes and Abstract methods :
		/*
		 * An abstract class is a class that is declared with abstract keyword.
		 * An abstract method is a method that is declared without an implementation.
		 * An abstract class may or may not have all abstract methods. Some of them can be concrete methods
		 * A method defined abstract must always be redefined in the subclass,thus making overriding compulsory OR either make subclass itself abstract.
		 * Any class that contains one or more abstract methods must also be declared with abstract keyword.
		 * There can be no object of an abstract class.That is, an abstract class can not be directly instantiated with the new operator.
		 * An abstract class can have parametrized constructors and default constructor is always present in an abstract class.
		 */
		
		//Advantages of Abstraction
		/*
		 * It reduces the complexity of viewing the things.
		 * Avoids code duplication and increases reusability.
		 * Helps to increase security of an application or program as only important details are provided to the user.
		 */
	}

}

//Abstract Class
/*
 * 
 */
abstract class Fruit
{
	String seasonname;
	Fruit(String s)
	{
		this.seasonname=s;
	}
	abstract void getSeasonName();
}
class Mango extends Fruit
{
   String name;
   String sweetness;
	Mango(String s,String sweet,String name) {
		super(s);
		this.name=name;
		this.sweetness=sweet;
	}

	@Override
	void getSeasonName() {
	System.out.println(this.seasonname);
	}
}


//Interface
/*
 *Interfaces specify what a class must do and not how. It is the blueprint of the class.
 *So it specifies a set of methods that the class has to implement.
 *If a class implements an interface and does not provide method bodies for all functions specified in the interface, then the class must be declared abstract
  */
//Why do we use interface 
/*
 * It is used to achieve total abstraction.
 * Since java does not support multiple inheritance in case of class, but by using interface it can achieve multiple inheritance .
 */
//New features added in interfaces in JDK 9
/*
 * Static methods
 * Private methods
 * Private Static methods
 */

interface Shape1
{
	abstract void getArea();
	default void print() {
		System.out.println("I");
	}
}
 interface Shape2
 {
	 default void print() {
			System.out.println("I");
		}
 }
 
 class Temp implements Shape1,Shape2
 {
	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		
	}

	// When same default method then need to implement
	@Override
	public void print() {
		// TODO Auto-generated method stub
		Shape1.super.print();
	}
	 
 }


