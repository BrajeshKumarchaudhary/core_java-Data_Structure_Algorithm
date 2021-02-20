package com.designpattern.creational.singlton;

public class SingltonBreakDownByClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		LazyInitializedSingletonClass instance1 = LazyInitializedSingletonClass.getInstance();
		LazyInitializedSingletonClass instance2 = (LazyInitializedSingletonClass) instance1.clone();
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
		//to overcome this problem throw exception from singlton class from clone method.
	}

}
