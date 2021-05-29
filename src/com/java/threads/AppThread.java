package com.java.threads;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AppThread extends Thread {
	@Override
	public void run() {
		try (BufferedReader reader = new BufferedReader(new FileReader("/home/brajesh/Documents/NewSummary.txt"))) {
			String line = null;
			while (reader.readLine() != null) {
				System.out.println(Thread.currentThread().getName());
				System.out.println("" + reader.readLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		AppThread t1 = new AppThread();
		AppThread t2 = new AppThread();
		AppThread t3 = new AppThread();
		t1.start();
		t2.start();
		t3.start();
	}
}
