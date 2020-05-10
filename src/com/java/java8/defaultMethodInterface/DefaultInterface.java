package com.java.java8.defaultMethodInterface;

public interface DefaultInterface {
  public void calculateSum(double  a,double b);
  public void CalculateSquare(double b);
  default void  calculateSquareRoot(double a)
  {
	  System.out.println("Suqare root is--"+Math.sqrt(a));
  }
}
