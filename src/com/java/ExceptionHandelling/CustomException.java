package com.java.ExceptionHandelling;

public class CustomException  extends Exception{

	public CustomException(String s)
	{
		super(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new CustomException("Please enter valid String");
		}
		catch(CustomException ex)
		{
			System.out.print(ex.getMessage());
		}
		
		
		

	}

}
