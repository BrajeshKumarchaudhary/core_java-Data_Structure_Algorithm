package com.java.files;
import java.io.*;
public class FileReadMethod {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	  File file=new File("/home/sqyuser/Desktop/Test.txt/");
      BufferedReader br=new BufferedReader(new FileReader(file));
      String st;
      while((st=br.readLine())!=null)
      {
    	  System.out.println(st);
      }
	}
}
