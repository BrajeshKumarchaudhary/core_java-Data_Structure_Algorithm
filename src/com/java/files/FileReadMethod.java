package com.java.files;
import java.io.*;
public class FileReadMethod {

	/*
	 * Using Input stream
	 */
	private static String readFromInputStream(File file1) throws IOException
	{
		StringBuilder str=new StringBuilder();
		try {
			BufferedReader br=new BufferedReader(new FileReader(file1)); 
				String line;
				while((line=br.readLine())!=null)
				{
					str.append(line).append("\n");
				}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return str.toString();
	}
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	  File file1=new File("plainFile/Text.txt");
	  System.out.println(readFromInputStream(file1));
	}
}
