package com.java.threads;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadLocalExample {

	ThreadLocal<SimpleDateFormat> formatter = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy/MM/dd"));

	public static void main(String[] args) {
		ThreadLocalExample object = new ThreadLocalExample();
		Thread t1 = new Thread(() -> {
			Date d = new Date();
			System.out.println(object.getDOB(d));
		});
		t1.start();
		
	}

	public String getDOB(Date date) {
		/*
		 * We are creating every time SimpleDateformat object even 1000 of thread
		 * created to avoiding this Use ThreadLocal Class.
		 */
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		return formatter.get().format(date);
	}
}
