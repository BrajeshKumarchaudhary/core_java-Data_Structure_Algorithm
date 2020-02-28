package com.java.java7;

import java.io.BufferedReader;
import java.io.FileReader;

public class Feature7 {
  /*
   * Java 7 following feature
   * String class support String in switch statement
   * Binary Literals with prefix “0b”
   * Catch Multiple Exceptions in catch block --->catch (FirstException | SecondException ex)
   * Automatic resource management with try-with-resources
   * Try-with-resources statement
   * Improved Type Inference for Generic Instance Creation
   * Map<String, List<String>> anagrams = new HashMap<String, List<String>>(); bcms  Map<String, List<String>> anagrams = new HashMap<>();
   * Underscores in numeric literals int one_million = 1_000_000;
   * <> diamond operator
   */
	public static void String_switch( String token)
	{
		switch(token)
		{
		case("one"):
			System.out.println("One called");
			break;
		case("two"):
			System.out.println("two called");
			break;
		case("three"):
			System.out.println("two called");
			break;
		default:
			break;
		}
		}
	/*
	 *Try-with-resources statement 	
	 */
		public strictfp String f2()
		{
			//before
//			String path="";
//			BufferedReader br = new BufferedReader(new FileReader(path));
//			try {
//			   return br.readLine();
//			} finally {
//			   br.close();
//			}
			//now
			try (BufferedReader br = new BufferedReader(new FileReader(path))) {
				   return br.readLine();
				}			
			
		}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
