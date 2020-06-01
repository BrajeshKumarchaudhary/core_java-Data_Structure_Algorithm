package com.designpattern.Singlton;

public class Singleton_classic {

	private static  Singleton_classic instance=null;
	// private constructor to force use of 
    // getInstance() to create Singleton object
	private  Singleton_classic()
	{
		
	}
	public  static Singleton_classic getInstance()
	{
		if(instance==null)
		{
			instance= new Singleton_classic();
			return instance;
		}
		return instance;
	}
	
	
	
	public void check()
	{
		System.out.print("ok ");
	}
}
