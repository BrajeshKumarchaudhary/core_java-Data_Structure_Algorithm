package com.java.networking;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.UnknownHostException;

public class MyUrl {

	public static void main(String[] args) throws MalformedURLException, UnknownHostException {
		// TODO Auto-generated method stub
		
		URL url=new URL("https://www.hackerrank.com/dashboard");
		
		System.out.println("Protocol are used:"+url.getProtocol());
		System.out.println("Host:"+url.getHost());
		System.out.println("File:"+url.getFile());
		System.out.println("port"+url.getPort());
		System.out.println("path:"+url.getPath());
	}

}
