package com.designpattern.creational.singlton;

public class ThreadSafeSingleton {
	public static void main(String[] args) {

	}
}

class ThreadSafeSingletonClass {
	private static ThreadSafeSingletonClass instance = null;

	private ThreadSafeSingletonClass() {

	}

	private static synchronized ThreadSafeSingletonClass getIntstance() {
		if (instance == null) {
			instance = new ThreadSafeSingletonClass();
		}
		return instance;
	}
}
