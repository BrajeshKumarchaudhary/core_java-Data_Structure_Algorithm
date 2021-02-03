package com.java.classesObject;


public class Foo {
	
	public static void main(String[] args) {
		A a=new B();
     	a.f1();//U can not call child method that is not available in parent class.
	}
}
class A{
	public void f1() {
		System.out.println("F1 called");
	}
}
class B extends A{
	public void f1() {
		super.f1();
		System.out.println("F2 called");
	}
	public void f12() {
		System.out.println("F2 called");
	}
	
}


