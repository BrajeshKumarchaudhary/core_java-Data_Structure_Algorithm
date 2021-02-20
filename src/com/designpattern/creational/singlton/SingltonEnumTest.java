package com.designpattern.creational.singlton;

public class SingltonEnumTest {

	public static void main(String[] args) {
		SingltonEnum instance= SingltonEnum.INSTANCE;
		SingltonEnum instance2= SingltonEnum.INSTANCE;
		System.out.println(instance.hashCode());
		System.out.println(instance2.hashCode());
		instance.logMessage("I m calling You.");
	}

}
