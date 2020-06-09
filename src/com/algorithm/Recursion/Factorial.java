package com.algorithm.Recursion;
/*
 * Example or recursive
 * Calculate the factorial of number
 */
public class Factorial {
  
	public static double getFact(double num)
	{
		double fact = 1;
		if(num<0)
		{
			return 0;
		}
		if(num>1)
		{
			fact=num*getFact(num-1);
		}
		return fact;
	}
	
	
	
	public static void main(String[] args) {
          /*
           * Factorial can be done only for positive number
           * it is product of 1 to n number
           */
		System.out.println("Factorial--"+getFact(1));
	}

}
