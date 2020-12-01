package com.designpattern.creational.singlton;

public class EagerClassSingleton {
  
	public static void main(String[] args) {
		EagerInitializedSingleton obj=EagerInitializedSingleton.getInstance();
}
	
}

class EagerInitializedSingleton{
	/*
	 * In eager initialization, the instance of Singleton Class is created at the time of class loading, 
	 * this is the easiest method to create a singleton class but
	 * it has a drawback that instance is created even though client application might not be using it.
	 * No any exceptional Handling 
	 */
	private static final EagerInitializedSingleton object=new EagerInitializedSingleton();
	/*
	 *  //private constructor to avoid client applications to use constructor
	 */
	private EagerInitializedSingleton() {
		
	}
	public static  EagerInitializedSingleton getInstance() {
		return object;
	}
}
