package com.java.oops;
/*
 * Polymorphism 
 */
public class Polymorphism {

	public static void main(String[] args) {
     /*
      * one name and many form
      * In Java polymorphism is mainly divided into two types:
      * a.Compile time Polymorphism
      * b.Runtime Polymorphism
      */
		//Compile time Polymorphism
		/*
		 *It is also known as static polymorphism.
		 *This type of polymorphism is achieved by function overloading 
		 *When there are multiple functions with same name but different parameters then these functions are said to be overloaded.
		 */
	}
	
	//method overloading
	public int getSum(int a,int b)
	{
		return a+b;
	}
	public int getSum(int a,int b,int c)
	{
		return a+b+c;
	}
	
	//Runtime polymorphism:
	/*
	 *It is also known as Dynamic Method Dispatch.
	 *It is a process in which a function call to the overridden method is resolved at Runtime
	 *This type of polymorphism is achieved by Method Overriding.
	 */
}
//RuntTime polymorphism
class Parent
{
	public void getName()
	{
		System.out.print("Parent name");
	}
}

class Child extends Parent
{
	public void getName()
	{
		System.out.print("child name");
	}
}
