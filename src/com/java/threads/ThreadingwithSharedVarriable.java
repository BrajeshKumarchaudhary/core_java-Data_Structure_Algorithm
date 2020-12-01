package com.java.threads;

public class ThreadingwithSharedVarriable {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			new Thread(() -> {
				new Task().run();
			}).start();

			new Thread(() -> {
				new Task().stoptask();
			}).start();
		}
	}
}

class Task implements Runnable {
	private static boolean flag = true;

	@Override
	public void run() {
		if (flag) {
			System.out.println("Yes performing the task");
		}
	}

	public void stoptask() {
		flag = false;
	}
}
