package com.java.classesObject;

public interface I2 extends I1 {
	public default  void m1() {
		System.out.println("M1 in second interface");
	}
}
