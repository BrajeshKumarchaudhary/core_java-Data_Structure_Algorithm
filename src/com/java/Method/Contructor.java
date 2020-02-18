package com.java.Method;

class Application
{
	int i;
	int j;
	//contructor overloading
	public Application(int i,int j) {
		// TODO Auto-generated constructor stub
	    this.i=i;
		this.j=j;
	}
	public Application(int j) {
		// TODO Auto-generated constructor stub
		this.j=j;
	}
	
	public Application() {
		// TODO Auto-generated constructor stub
		this.j=10;
	}
	@Override
	public String toString()
	{
		return this.i+""+this.j;
	}
}

public class Contructor implements Cloneable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application app=new Application(10,20);
		System.out.print(app);//print object directly

	}

}
