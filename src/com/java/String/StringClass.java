package com.java.String;

public class StringClass {

	public static void StringOperation(String str)
	{
		System.out.println(str);
		System.out.println("Reverse String:"+new StringBuffer(str).reverse().toString());
		System.out.println("Remove spaces String:"+str.trim());
		System.out.println("The second character is :"+str.charAt(2));
		System.out.println("Substring of 2 length   "+str.substring(0,4));
		System.out.println("append string "+str.concat("B.Tech"));
	    System.out.println("check string contains or not "+str.contains("Bra"));
	    System.out.println("check wheather string is empty or not "+str.isEmpty());
	    System.out.println("Lower case is "+str.toLowerCase()+" Upper case is "+str.toUpperCase());
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Brajesh kumar";
		StringOperation(str);
		
	}

}
 