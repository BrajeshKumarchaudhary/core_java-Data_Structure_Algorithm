package com.java.classesObject;

public class CheckPrivateConstructor {
  
	public static void main(String[] args) {
	}
	
}

class Demo
{
	
	
	/*
	 * When making constructor as an private then only with in class object is created
	 */
	private Demo()
	{
		
	}
	
	public void show()
	{
		Demo d=new Demo();
	}
}


