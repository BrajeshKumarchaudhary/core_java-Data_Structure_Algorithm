package com.java.classesObject;

import java.util.Arrays;

public class MyInnerClass {

   class Demo
   {
	   Demo()
	   {
		   System.out.println("Inner class object invoked");
	   }
	   public  void check()
	   {
		   System.out.println("called");
	   }
   }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         new MyInnerClass(). new Demo().check();
	}

}
