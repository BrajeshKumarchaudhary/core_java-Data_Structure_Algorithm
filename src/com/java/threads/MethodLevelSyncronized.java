package com.java.threads;

public class MethodLevelSyncronized {

	public static void main(String[] args) {
		Thread t = new Thread(() -> {
			Method.callMethod();
		});

		Thread t1 = new Thread(() -> {
			Method.callMethod();
		});
		t.setName("First");
		t1.setName("second");
		t.start();
		t1.start();
	}

}

class Method {

	public synchronized static void callMethod() {
		System.out.println("First Method level Thread called");
		System.out.println("first Method level Thread End "+Thread.currentThread().getName());
	}

	public static void callMethod1() {
		System.out.println("Second Method level Thread called");
		System.out.println("Second Method level Thread End "+Thread.currentThread().getName());
	}

}
