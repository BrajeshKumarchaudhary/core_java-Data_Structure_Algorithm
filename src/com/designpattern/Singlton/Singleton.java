package com.designpattern.Singlton;

public class Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton_classic obj=Singleton_classic.getInstance();
		Singleton_classic obj1=Singleton_classic.getInstance();
		obj1.check();

	}

}
