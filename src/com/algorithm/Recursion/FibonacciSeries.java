package com.algorithm.Recursion;

/*
 *Program for Fibonacci numbers 
 */
public class FibonacciSeries {

	static double nthFibNumber(int num) {
		double nth = 0;
		if (num < 1) {
			System.out.print("Fibonacci series only for +tive number or greater than 0");
			return nth;
		}
		if (num == 1 || num == 2) {
			nth = num - 1;
		} else {
			nth = nthFibNumber(num - 1) + nthFibNumber(num - 2);
		}
		return nth;

	}

	// fibSeries
	static void fibSeries(int num) {
		int a = 0;
		int b = 1;
		int c;
		if (num < 1 || num == 0) {
			System.out.println(0);
		}
		System.out.println(0);
		for (int i = 2; i <= num; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		/*
		 * Fn = Fn-1 + Fn-2 where F0 = 0 and F1 = 1. A Series of numbers in which each
		 * number is the sum of the two preceding numbers First two numbers by
		 * definitipon 0 and 1; eg .0,1,1,2,3,5,8,13,21,34...
		 */
		System.out.println("Fibonacci Series for ---");
		fibSeries(10);
		System.out.println("Last digit of --" + nthFibNumber(10));
	}

}
