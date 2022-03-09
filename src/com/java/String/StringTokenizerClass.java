package com.java.String;

import java.util.StringTokenizer;

/*
 * StringTokenizer class
 */
public class StringTokenizerClass {

	public static void main(String[] args) {
      String s="He is a very very good boy, isn't he?";
      splitStringByRegex(s);
		/*
       *StringTokenizer class in Java is used to break a string into tokens.
       */
		//Constructor
		//a.StringTokenizer(String str):Considers default delimiters like new line, space, tab, 
//		StringTokenizer str=new StringTokenizer(s);
//		//b.StringTokenizer(String str, String delim) :delim is set of delimiters that are used to tokenize
//		//the given string
//		StringTokenizer str1=new StringTokenizer(s, " ");
//		//c.StringTokenizer(String str, String delim, boolean flag):If the flag is false, delimiter characters serve to separate tokens
//          //If the flag is true, delimiter characters are considered to be tokens
//        StringTokenizer str3=new StringTokenizer(s, " ", true);
//        System.out.print(str.countTokens());
//        while(str.hasMoreTokens())
//        {
//    	   System.out.println(str.nextToken());
//        }
	}
	
	
	public static void splitStringByRegex(String s) {
		if(s.length()==0){
            System.out.println(0);
            return;
        }
        /* Split on all non-alphabetic characters */
        String[] words = s.split("[^a-zA-Z]+");
        
        /* Print output */
        System.out.println(words.length);
        for (String word : words) {
            System.out.println(word);
        }
	}
	 private static String removeLeadingNonLetters(String str) {
	        int i;
	        for (i = 0; i < str.length(); i++) {
	            if (Character.isLetter(str.charAt(i))) {
	                break;
	            }
	        }
	        return str.substring(i);
	    }

}
