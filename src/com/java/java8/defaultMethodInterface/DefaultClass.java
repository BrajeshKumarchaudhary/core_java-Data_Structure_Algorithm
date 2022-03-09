package com.java.java8.defaultMethodInterface;

public class DefaultClass {

	public static void main(String[] args) {
		DefaultInterface obj=new DefaultInterface() {
			
			@Override
			public void calculateSum(double a, double b) {
				System.out.println("Sum--"+(a+b));
				
			}
			
			@Override
			public void CalculateSquare(double b) {
				System.out.println("Square is--"+(b*b));
				
			}
			@Override
			public void calculateSquareRoot(double b) {
				System.out.println("Square is--"+(b*b));
				
			}
		};
     obj.CalculateSquare(200);
     obj.calculateSquareRoot(400);
     obj.calculateSum(300, 400);
	}

}
