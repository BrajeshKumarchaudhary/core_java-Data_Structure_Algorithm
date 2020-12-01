package com.designpattern.creational.singlton;

public class LazyInitializedSingleton {
	public static void main(String[] args) {

	}
}
/*
 * Lazy initialization method to implement Singleton pattern creates the instance in the global access method. 
 * Here is the sample code for creating Singleton class with this approach.
 */
class LazyInitializedSingletonClass {

	private static LazyInitializedSingletonClass instance = null;

	// make constructor private to avoid creating new instance
	private LazyInitializedSingletonClass() {
	}

	public static LazyInitializedSingletonClass getInstance() {
		if (instance == null) {
			instance = new LazyInitializedSingletonClass();
		}
		return instance;
	}
}
