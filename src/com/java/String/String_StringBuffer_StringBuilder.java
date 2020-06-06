package com.java.String;
/*
 * String vs StringBuilder vs StringBuffer in Java
 */

public class String_StringBuffer_StringBuilder {

	public static void main(String[] args) {
          String s1="Brajesh";
          StringOp op=new StringOp();
          op.concate(s1);//s1 cannot changed
          StringBuilder s2=new StringBuilder("Brajesh");
          op.concate1(s2);//s2 changed
          StringBuffer s3=new StringBuffer("Brajesh");
          op.concate2(s3);//s3 Changed
          
          //When to use which one :
          /*a.If a string is going to remain constant throughout the program, then use String class object because a String object is immutable.
           *b.If a string can change (example: lots of logic and operations in the construction of the string) and will only be accessed from a single thread, using a StringBuilder is good enough.
           *c.If a string can change, and will be accessed from multiple threads, use a StringBuffer because StringBuffer is synchronous so you have thread-safety. 
           */
	}

}

class StringOp{
	//String concatenation
	public void concate(String s1)
	{
		s1=s1+"Kumar";
	}
	//StringBuilder concatenation
	public void concate1(StringBuilder s2)
	{
		s2.append("Kumar");
	}
	
	//StringBuffer Concatenation
	public void concate2(StringBuffer s3)
	{
       s3=s3.append("Kumar");		
	}
}
