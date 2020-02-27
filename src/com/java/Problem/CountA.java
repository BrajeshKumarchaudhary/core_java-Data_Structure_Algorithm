package com.java.Problem;

public class CountA {
	 static long repeatedString(String s, long n) {
		    long na=s.length();
		    long q=n/na;
		    int count=0;
		    char a[]=s.toCharArray();
		    for(int i=0;i<a.length;i++)
		    {
		    	if(a[i]=='a')
		    	{
		    		count++;
		    	}
		    	
		    }
		    
				    long result=q*count;
		    long r=n%na;
		    for(int i=0;i<r;i++)
		    {
		    	if(a[i]=='a')
		    	{
		    		result++;
		    	}
		    }
          return result;

	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		System.out.print(repeatedString("aba",n));

	}

}
