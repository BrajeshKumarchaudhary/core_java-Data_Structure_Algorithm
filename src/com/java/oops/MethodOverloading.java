package com.java.oops;

public class MethodOverloading extends Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math obj=new Math();
		obj.add(2, 3);
		obj.add(2, 3,4);

		
	}
	
}
class  Math
{
	public void add(int a,int b)
	{
		System.out.print("the sum is "+(a+b));
	}
	public void add(int a,int b,int c)
	{
		System.out.print("the sum is "+(a+b+c));
	}

}



