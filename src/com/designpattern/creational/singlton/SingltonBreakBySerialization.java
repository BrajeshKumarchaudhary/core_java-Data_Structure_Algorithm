package com.designpattern.creational.singlton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingltonBreakBySerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		LazyInitializedSingletonClass instance1=LazyInitializedSingletonClass.getInstance();
		//serialized
		FileOutputStream fileout=new FileOutputStream("Test.txt");
		ObjectOutputStream out=new ObjectOutputStream(fileout);
		out.writeObject(instance1);
		
		FileInputStream fin=new FileInputStream("Test.txt");
		ObjectInputStream in=new ObjectInputStream(fin);
		LazyInitializedSingletonClass instance2=(LazyInitializedSingletonClass)in.readObject();
		in.close();
		out.close();
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
		
		
		//to overCome this Problem
		//IN Singlton class ovverride readResolve() and return same instance.
		

		
		
		
		
	}

}
