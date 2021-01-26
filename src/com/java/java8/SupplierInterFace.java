package com.java.java8;

import java.util.function.Supplier;

public class SupplierInterFace {

	public static void main(String[] args) {
     Supplier<String> sup=(()->{
    	 return "Brajesh";
     });
	System.out.println(sup.get());	
	}

}
