package com.java.Collection;

import java.util.Stack;

public class MyStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stack<Character> stack =new Stack<>();
        String str="brajesh kumar";
        char c[]=str.toCharArray();
        for (char d : c) {
			stack.push(d);
		}
        System.out.println("Reverse String");
        while(!stack.isEmpty())
        {
        	System.out.print(""+stack.pop());
        }
			
		}
 	}

