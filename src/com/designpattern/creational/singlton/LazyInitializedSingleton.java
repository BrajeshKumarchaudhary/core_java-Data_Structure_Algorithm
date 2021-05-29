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
class LazyInitializedSingletonClass  implements Serializable,Cloneable {
	private static LazyInitializedSingletonClass instance = null;

	// make constructor private to avoid creating new instance at time of Reflection
	private LazyInitializedSingletonClass() {
		//double check to avoid creation object from Reflection
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
	//implement this method to avoid create object from Serialization
	public Object readResolve() {
		return instance;
	}
	//Override this method to avoid  creating object from cloning
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Clone not Supported");
	}
}
