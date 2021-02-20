package com.designpattern.Singlton;

public class Test1 {
	static int x = 10;

	public static void main(String[] args) {
		Test1 obj = new Test1();
		obj.x = x + 1;
		Test1 obj1 = new Test1();
		System.out.println(obj.x + obj1.x);
	}

}
