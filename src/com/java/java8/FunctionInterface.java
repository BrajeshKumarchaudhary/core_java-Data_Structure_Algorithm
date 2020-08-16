package com.java.java8;

public class FunctionInterface// implements FunctionalInterFace 
{

	
	// In Tradional Way we need to first implement then call it.
//	@Override
//	public void print() {
//	  System.out.println("Hello I m tradional way ");
//	}
  public static void main(String[] args) {
//	  FunctionInterface obj=new FunctionInterface();
//	  obj.print();
	  
	  // new way
	  //Lamda Expression
//	  FunctionalInterFace intr=()->{
//		System.out.println("I m called with new Way of java 8");  
//	  };
//	  intr.print();
	  
	  FunctionalInterFace intr=(n)->{
		if(n%2==0) {
			System.out.println("Number is even");
		}else {
			System.out.println("Number is odd");
		}
	  };
	  intr.checknumberIsPrime(21);
}
}

@FunctionalInterface
interface FunctionalInterFace
{
	/*
	 * The InterFace who conatins only one abstract method but can have multiple default and  static method is called functional interface.
	 * Ex.
	 * Runnable   -->run()
	 * Callable   -->call()
	 * Comparable -->compareTo()
	 * Comparator   -->compare()
	 */
//	public void print();//abstract function without param
	public void checknumberIsPrime(int n);
}


