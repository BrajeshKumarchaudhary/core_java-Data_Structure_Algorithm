package com.java.Collection;

import java.util.StringTokenizer;

public class StringTokenizerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   String str="new  babhjabfjba bhafja";
		StringTokenizer token=new StringTokenizer(str," ");
		System.out.println(token.countTokens());
		while(token.hasMoreElements())
		{
			String value=token.nextToken();
			System.out.println(value);
		}
		
	} 

}
