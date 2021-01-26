package com.java.Problem;

import java.util.Arrays;
import java.util.StringTokenizer;


public class CountNumberWords {

	
	public static int printCountWords(String str)
	{
//		String chunk[]=str.split("\\s+");
		
//		return chunk.length;
		StringTokenizer tokens = new StringTokenizer(str);
		System.out.print(Arrays.asList(tokens));
	    return tokens.countTokens();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String str1="Brajesh        kumar           Btech";
		 System.out.println("number of words="+printCountWords(str1));

	}

}
