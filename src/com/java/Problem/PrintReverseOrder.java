package com.java.Problem;

public class PrintReverseOrder {
	 public static void printInReverseOrder(int a[])
     {
         for(int i=a.length-1;i>=0;i--)
         {
             System.out.print(a[i]+" ");
         }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int ab[]= {2,5,6,7};
      printInReverseOrder(ab);
	}

}
