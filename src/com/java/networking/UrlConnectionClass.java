package com.java.networking;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnectionClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		URL url=new URL("https://www.squareyards.ca/sale/ontario/toronto");
		URLConnection con=url.openConnection();
		System.out.println("LastModified"+con.getLastModified());
		int length=con.getContentLength();
		if(length==0)
		{
			System.out.println("Content is not available");
		}
		else
		{
			int ch;
			FileOutputStream out=new FileOutputStream("Index1.html");
			InputStream in=con.getInputStream();
			while((ch=in.read())!=-1) {
				out.write((char)ch);
				
			}
			System.out.println("finished ");
		}

	}

}
