package com.java.oops;

public class MethodOverriding extends Calculation {

	public void add(int a,int b)
	{
		System.out.println("sum "+(a+b));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation obj=new MethodOverriding();
		obj.add(2, 3);

	}

}

class Calculation
{
	public void add(int a,int b)
	{
		System.out.print("the sum is "+(a+b));
	}
}
