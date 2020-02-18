package com.java.generictypes;

public class GenricClass<T> {
       
        public void display(T var)
        {
        	System.out.print("The generic type is"+var);
        }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenricClass<String> obj=new GenricClass<>();
		obj.display("brjaehs");
		System.out.print("The generic class is type safe");

	}

}
