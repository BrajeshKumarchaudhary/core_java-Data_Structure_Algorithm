package com.java.Problem;

import java.util.Stack;

public class ReverseString {

	
	/*
    *  using simple array method
    */
	public static void reverseString(String str)
	{
		char item[]=str.toCharArray();
		for(int i=item.length-1;i>=0;i--)
		{
			System.out.print(""+item[i]);
		}
	}
	/*
	 * reverse string using stack Class
	 */
	public static  void reverseString1(String str)
	{
		Stack<Character> st=new Stack<>();
		char item[]=str.toCharArray();
		for(int i=0;i<item.length;i++)
		{
			st.push(item[i]);
		}
		while(!st.empty())
		{
			System.out.print(""+st.pop());
		}
	}
	/*
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="brajesh";
		System.out.println("Revrese String using array iterator");
		reverseString(st);
		System.out.println("Reverse String using Stack class");
		reverseString1(st);
		
          
	}

}
