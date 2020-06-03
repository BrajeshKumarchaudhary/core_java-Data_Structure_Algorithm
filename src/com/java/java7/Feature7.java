package com.java.java7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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
	private static  int binary=0b1000; //8
	public static void String_switch( String token)
	{
		
		if(binary==8)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		try {
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
		catch(ArithmeticException |StringIndexOutOfBoundsException ex)
		{
			System.out.println(ex.getLocalizedMessage());
		}
		catch(Exception aex)
		{
			System.out.println(aex.getMessage());
		}
		
		}
	/*
	 *Try-with-resources statement 	
	 */
	//Syntax
	/*
	 *static String readFirstLineFromFile(String path) throws IOException
    {
    try (BufferedReader br = new BufferedReader(new FileReader(path)))
    {
        return br.readLine();
    }
}
	 */
	public static String readFile()
	{
		String str="plainFile/Text.txt";
		StringBuilder result=null;
		try (BufferedReader b = new BufferedReader(new FileReader(str))) 
        { 
            String s; 
            while ((s = b.readLine()) != null)  
            { 
            	result=result.append(s);
                System.out.println(s); 
            } 
        }  
        catch (IOException e)  
        { 
            e.printStackTrace(); 
        }
		return result.toString();
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_switch("one");
	}

}
