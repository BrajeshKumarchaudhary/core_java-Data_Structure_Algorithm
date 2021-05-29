package com.designpattern.observer;

import java.util.*;

public class WheatherStation implements Subject {

	int temp;
	int humadity;

	List<Observer> observerList;

	public WheatherStation() {
		this.observerList = new LinkedList<>();
	}

	@Override
	public void resgisterObserver(Observer o) {
		observerList.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int observerIndex = observerList.indexOf(o);
		if (observerIndex >= 0) {
			observerList.remove(observerIndex);
		}
	}

	@Override
	public void notifyObserver() {
		observerList.forEach(observer -> observer.update(temp, humadity));
	}

	public void measurement(int temp, int humadity) {
		this.humadity = humadity;
		this.temp = temp;
		notifyObserver();
	}

}
