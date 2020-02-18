package com.java.Streams;

import java.io.FileReader;
import java.io.IOException;

public class CharacterStream {
   /*
    * Character stream automatically allows us to read/write data character by character.
    *  For example FileReader and FileWriter are character streams used to read from source and write to destination.
    * 
    * 
    */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileReader file=null;
		try
		{
			file =new FileReader("/home/sqyuser/Desktop/Test.txt");
			int temp;
			while((temp=file.read())!=-1)
			{
				System.out.print((char)temp);
			}
		}
		finally {
			file.close();
		}

	}

}
