package com.java.oops;

public class StaticVarraibleDeclarations {

	static int i;
	StaticVarraibleDeclarations(int k)
	{
		i=k;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVarraibleDeclarations o1=new StaticVarraibleDeclarations(2);
		System.out.print(StaticVarraibleDeclarations.i);
		StaticVarraibleDeclarations o2=new StaticVarraibleDeclarations(4);
		System.out.print(StaticVarraibleDeclarations.i);
		StaticVarraibleDeclarations o3=new StaticVarraibleDeclarations(8);
		System.out.print(StaticVarraibleDeclarations.i);

	}

}
