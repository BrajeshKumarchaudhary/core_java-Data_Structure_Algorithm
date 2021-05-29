package com.designpattern.observer;

public interface Subject {
	void resgisterObserver(Observer o);

	void removeObserver(Observer o);

	void notifyObserver();
}
