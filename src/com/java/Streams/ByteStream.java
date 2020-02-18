package com.java.Streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
   /*
    * Byte streams process data byte by byte (8 bits). 
    * For example FileInputStream is used to read from source and FileOutputStream to write to the destination.
    * 
    */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream source=null;
		FileOutputStream dest=null;
		try
		{
			source=new FileInputStream("/home/sqyuser/Desktop/Test.txt");
			dest=new FileOutputStream("/home/sqyuser/Desktop/Test2.txt");
			int temp;
			while((temp=source.read())!=1)
			{
				dest.write((char)temp);
			}
		}
		finally
		{
		  source.close();
		  dest.close();
		}

	}

}
