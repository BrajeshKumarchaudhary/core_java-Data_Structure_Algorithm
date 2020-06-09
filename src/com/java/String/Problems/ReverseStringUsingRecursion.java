package com.java.String.Problems;

/*
 * Program for Reverse String using recursion
 */
public class ReverseStringUsingRecursion {

	//swap the value
	static void swap(char arr[],int l,int h)
	{
		char temp=arr[l];
		arr[l]=arr[h];
		arr[h]=temp;
	}
    //print revrse String using Recursion
	static void reverseString(char arr[],int l,int h)
	{
		if(l<h)
		{
			swap(arr,l,h);
			reverseString(arr,l+1,h-1);
		}
	}
	
	
	public static void main(String[] args) {
		/*
		 * Basic algo 
		 * We Simply replace first character to last character and increased the lower index and decrease the higher index
		 * while lower is less than higher
		 */
         String str="Brajesh";
         System.out.println("Reverse the string--"+str);         
         char arr[]=str.toCharArray();
         reverseString(arr,0,arr.length-1);
          str=new String(arr);
         System.out.println("Reverse String is--"+str);
	}

}
