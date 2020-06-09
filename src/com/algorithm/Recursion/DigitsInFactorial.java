package com.algorithm.Recursion;

/*
 * Example of count no. of digit in factrial of number 
 */
public class DigitsInFactorial {

	static int countDigits(int n)
	{
		if(n<0)
		{
			return 0;
		}
		//Base Case
		if(n<=1)
		{
			return 1;	
		}
		// else iterate through n and calculate the 
        // value 
        double digits = 0; 
        for (int i=2; i<=n; i++) 
            digits += Math.log10(i); 
   
        return (int)(Math.floor(digits)) + 1; 
	}
	
	public static void main(String[] args) {
     /*
      *We know,
        log(a*b) = log(a) + log(b) 
        Therefore
        log( n! ) = log(1*2*3....... * n) 
                  = log(1) + log(2) + ........ +log(n)
                  Hence, output would be : floor(log(n!)) + 1.
      */
		System.out.println("Digits in Factorial of--"+countDigits(100));
	}

}
