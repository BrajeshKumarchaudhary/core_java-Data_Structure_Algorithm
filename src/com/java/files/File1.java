package com.java.files;

import java.io.File;

public class File1 {
	
/*boolean canExecute() : Tests whether the application can execute the file denoted by this abstract pathname.	
*/
	public boolean checkExcution(File file)
	{
		return file.canExecute();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("/home/sqyuser/Desktop/Test.txt");
		System.out.println("File name :"+f.getName()); 
        System.out.println("Path: "+f.getPath()); 
        System.out.println("Absolute path:" +f.getAbsolutePath()); 
        System.out.println("Parent:"+f.getParent()); 
        System.out.println("Exists :"+f.exists()); 
        if(f.exists()) 
        { 
            System.out.println("Is writeable:"+f.canWrite()); 
            System.out.println("Is readable"+f.canRead()); 
            System.out.println("Is a directory:"+f.isDirectory()); 
            System.out.println("File Size in bytes "+f.length()); 
        }  
	}

}
