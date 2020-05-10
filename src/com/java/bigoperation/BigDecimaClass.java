package com.java.bigoperation;

import java.math.BigDecimal;

public class BigDecimaClass {

	
	/*
	 * When floating point is performed on large number then gives error approx 10 power of -19
	 */
	public static void main(String[] args) {
		double a=0.04;
		double b=0.06;
		double c=b-a;
		System.out.println("normal operations--"+c);
	BigDecimal a0=BigDecimal.valueOf(a);
	BigDecimal b0=BigDecimal.valueOf(b);
	BigDecimal c0=b0.subtract(a0);
	System.out.println(c0);
        	}

}
