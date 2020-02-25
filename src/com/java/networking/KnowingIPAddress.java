package com.java.networking;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class KnowingIPAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the website name");
    String str=sc.next();
    try {
    	InetAddress ip=InetAddress.getByName(str);
    	System.out.println("The ip of site is"+ip);
    }
    catch(UnknownHostException ex)
   {
    	System.out.println(ex.getMessage());
    	
    }
		
		
		
	}

}
