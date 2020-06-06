package com.java.String;
/*
 *StringBuilder cLass 
 */
public class StringBuilderClass {

	public static void main(String[] args) {
		/*
		 *The StringBuilder in Java represents a mutable sequence of characters
		 *String Class in Java creates an immutable sequence of characters, the StringBuilder class provides an alternative to String Class, 
		 */
		//StringBuilder Constructor
		//a.StringBuilder(): Constructs a string builder with no characters in it and an initial capacity of 16 characters.
		     StringBuilder str1=new StringBuilder();
		//b.StringBuilder(int capacity): Constructs a string builder with no characters in it and an initial capacity specified by the capacity argument.
		     StringBuilder str2=new StringBuilder(20);
		//c.StringBuilder(CharSequence seq): Constructs a string builder that contains the same characters as the specified CharSequence.
		     StringBuilder str=new StringBuilder("brajesh");
		//d.StringBuilder(String str): Constructs a string builder initialized to the contents of the specified string.
		     StringBuilder str3=new StringBuilder(str1);  
}
}
