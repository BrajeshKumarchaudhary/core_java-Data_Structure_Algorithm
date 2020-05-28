package com.java.Problem;

import java.util.Scanner;

public class PrintString {
	
	public static void printString(String str)
	   {
	     char st[]=str.toCharArray();
	     String s1="";
	     String s2="";
	     for(int i=0;i<st.length;i++)
	     {
	       if(i%2==0)
	       {
	           s1=s1+st[i];
	       }
	       else{
	           s2=s2+st[i];
	       }
	     }
	    System.out.println(s1+" "+s2);

	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        int t=sc.nextInt();
	        for(int i=0;i<t;i++)
	        {
	            String s=sc.next();
	            printString(s);
	        }
	}

}
