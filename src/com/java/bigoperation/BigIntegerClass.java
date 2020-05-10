package com.java.bigoperation;

import java.math.BigInteger;

/*
 * BigInteger Class is used when the value can not fit in primitive data type like
 * Byte,Short,Int
 */
public class BigIntegerClass {

	public static void main(String[] args) {
	BigInteger a=new BigInteger("22222222222222222222222222222");
	BigInteger b=new BigInteger("22222222222222222222222222222");
	BigInteger c=a.add(b);
	System.out.println(c);
	  
	}

}
