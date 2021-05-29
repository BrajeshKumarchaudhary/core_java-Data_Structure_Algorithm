package com.java.threads;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppThread4 {
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
		ScheduledExecutorService service=Executors.newScheduledThreadPool(1);
		service.scheduleWithFixedDelay(t1, 0, 1, TimeUnit.SECONDS);
		try {
			service.awaitTermination(10, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			service.shutdownNow();
			e.printStackTrace();
		}
		System.out.println("Main Method is called-----------");
		Logger.getLogger(AppThread2.class.getName()).log(Level.INFO, "Main Method is Ended");
	}
}
