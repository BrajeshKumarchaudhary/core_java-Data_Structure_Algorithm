package com.designpattern.creational.singlton;

public class StaticBlockSingleton {
	public static void main(String[] args) {
		StaticBlockSingletonClass obj = StaticBlockSingletonClass.getInstance();

	}
}

class StaticBlockSingletonClass {
	/*
	 * Static block initialization implementation is similar to eager
	 * initialization, except that instance of class is created in the static block
	 * that provides option for exception handling.
	 */
	private static StaticBlockSingletonClass instance;
	// static block initialization for exception handling
	static {
		try {
			instance = new StaticBlockSingletonClass();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// make constructor private to avoid making new instance
	private StaticBlockSingletonClass() {

	}

	public static StaticBlockSingletonClass getInstance() {
		return instance;
	}
}
