package com.java.String.Problems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AppThread2 {
	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			try (BufferedReader reader = new BufferedReader(new FileReader("/home/brajesh/Documents/NewSummary.txt"))) {
				String line = null;
				while (reader.readLine() != null) {

					System.out.println(Thread.currentThread().getName());
					System.out.println("" + reader.readLine());
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		});
		ExecutorService executor=Executors.newSingleThreadExecutor();
		  executor.submit(t1);
		  executor.shutdownNow();
	}
}
