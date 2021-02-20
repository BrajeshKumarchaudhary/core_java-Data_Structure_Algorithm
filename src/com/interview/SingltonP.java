package com.interview;

public class SingltonP {
	private static SingltonP instance = null;

	private void SingltonP() {

	}

	public static SingltonP getInstnce() {
		if (instance == null) {
			instance = new SingltonP();
		}
		return instance;
	}

	public static void main(String args[]) {
		SingltonP instance1 = SingltonP.getInstnce();
		SingltonP instance2 = SingltonP.getInstnce();
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}

}
