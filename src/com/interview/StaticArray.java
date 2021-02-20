package com.interview;

public class StaticArray {

	/*
	 * the keyword static indicates that the particular member belongs to a type itself, 
	 * rather than to an instance of that type.
	 * This means that only one instance of that static member is created which is shared across all instances of the class.
	 */
	public static void changeArray(int arr[]) {
		arr[0] = 30;
	}

	public static void main(String[] args) {
		PersonDemo obj=new PersonDemo();
		obj.setCompanyName("Bkkk");
		obj.setCompanyId(10);
		PersonDemo obj1=new PersonDemo();
		obj1.setCompanyName("Bkkk1111");
		obj1.setCompanyId(101);
		
		
		System.out.println(obj.getCompanyName());
//		System.out.println(obj1.getCompanyName());
		int a[] = { 1, 2, 34 };
		changeArray(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(" " + a[i]);
		}
		System.out.println(""+34.8%3);
		byte b;
		int c=2;
		b=(byte)c;
		System.out.println(b);
	}

}
