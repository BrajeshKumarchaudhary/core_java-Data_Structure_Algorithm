package com.designpattern.creational.singlton;

public enum SingltonEnum {
  INSTANCE;
  public void logMessage(String str) {
	  System.out.println(str);
  }
}
