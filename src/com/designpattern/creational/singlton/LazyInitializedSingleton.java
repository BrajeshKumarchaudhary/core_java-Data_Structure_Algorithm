package com.designpattern.creational.singlton;

import java.io.Serializable;

public class LazyInitializedSingleton {
	public static void main(String[] args) {

	}
}

/*
 * Lazy initialization method to implement Singleton pattern creates the
 * instance in the global access method. Here is the sample code for creating
 * Singleton class with this approach.
 */
class LazyInitializedSingletonClass extends MyClone implements Serializable {

	private static LazyInitializedSingletonClass instance = null;

	// make constructor private to avoid creating new instance
	private LazyInitializedSingletonClass() {
		if (instance != null) {
			throw new IllegalStateException("Oject can not be created from reflections");
		}
	}

	public static LazyInitializedSingletonClass getInstance() {
		if (instance == null) {
			instance = new LazyInitializedSingletonClass();
		}
		return instance;

	}

	public Object readResolve() {
		return instance;
	}

}
