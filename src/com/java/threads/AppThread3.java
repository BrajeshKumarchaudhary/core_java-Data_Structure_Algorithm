package com.java.threads;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AppThread3  implements Runnable{

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
		AppThread3 app=new AppThread3();
		Thread t1=new Thread(app);
		t1.start();
	}

}
