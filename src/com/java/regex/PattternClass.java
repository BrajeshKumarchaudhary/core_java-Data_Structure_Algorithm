package com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PattternClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Brajes kumar";	
		String p1="Bra";
		Pattern pa=Pattern.compile(p1);
		Matcher m=pa.matcher(str);
		while(m.find())
		{
			  System.out.println("Pattern found from " + m.start() + 
                      " to " + (m.end()-1)); 
		}

	}

}
