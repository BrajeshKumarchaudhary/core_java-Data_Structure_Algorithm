package com.java.classesObject;

public class MainCLass extends Class2 {

	public static void main(String[] args) {
		MainCLass m1 = new MainCLass();
		m1.m11();
		m1.m1();
		m1.n1();
	}

	@Override
	public void m11() {
		System.out.println("M11 of Second Class.");
	}

	@Override
	void m1() {
		System.out.println("M1 of first Class.");
	}

}
