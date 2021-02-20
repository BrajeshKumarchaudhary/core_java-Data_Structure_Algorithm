package com.designpattern.creational.singlton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingltonBreakDownByRefelection {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		LazyInitializedSingletonClass instance1 = LazyInitializedSingletonClass.getInstance();

		Constructor<LazyInitializedSingletonClass> object = LazyInitializedSingletonClass.class
				.getDeclaredConstructor();
//		for (Constructor<LazyInitializedSingletonClass> constructor : object) {
		object.setAccessible(true);
		LazyInitializedSingletonClass instance2 = object.newInstance();
//		}

		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());

		// to overcome this problem
		// In singlton class in private Constructor check if instance not equal null
		// then throw an exceptions.

	}

}
