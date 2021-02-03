package com.java.threads;

public class ObjectLevelLocking {

	public static void main(String[] args) {
		ObjectLevel object = new ObjectLevel();
		Thread t1 = new Thread(() -> {
			object.ExcecuteTask();
		});

		Thread t2 = new Thread(() -> {
			object.ExcecuteWithoutLock();
		});
		t1.setName("T1");
		t2.setName("T2");
		t1.start();
		t2.start();
	}
}

class ObjectLevel {
	public void ExcecuteTask() {
		synchronized (ObjectLevel.class) {
			System.out.println("Called Thread name is " + Thread.currentThread().getName());
			System.out.println("Thread End name is " + Thread.currentThread().getName());
		}
	}

	public void ExcecuteWithoutLock() {
		System.out.println("Called Thread Name is " + Thread.currentThread().getName());
		System.out.println("Thread End name is " + Thread.currentThread().getName());
	}
}
