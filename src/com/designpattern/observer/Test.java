package com.designpattern.observer;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		WheatherStation station=new WheatherStation();
		ForcastingDisplay display=new ForcastingDisplay(station);
		for(int i=0;i<10;i++) {
		station.measurement(10, 10);
		Thread.sleep(1000);
		}
	}
}
