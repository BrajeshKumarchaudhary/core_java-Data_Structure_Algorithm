package com.designpattern.observer;


public class ForcastingDisplay implements Observer {

	int temp;
	int humadity;

	public ForcastingDisplay(Subject subject) {
		subject.resgisterObserver(this);
	}

	@Override
	public void update(int temp, int humadity) {
		this.humadity = humadity;
		this.temp = temp;
		display();
	}

	public void display() {
		System.out.println("Temp---" + temp);
		System.out.println("Humadity---" + humadity);
	}

}
