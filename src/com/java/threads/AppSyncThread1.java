package com.java.threads;

public class AppSyncThread1 {

	private int count = 0;

	public synchronized void add(int n) {
		count = count + n;
	}
}
