package com.designpattern.creational.singlton;

public class MyClone implements Cloneable {

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Clone not Supported");
	}
}
