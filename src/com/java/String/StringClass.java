package com.java.String;
/*
 * String class in JAVA
 */
public class StringClass {

	public static void StringOperation(String str)
	{
		System.out.println(str);
		System.out.println("Reverse String:"+new StringBuffer(str).reverse().toString());
		System.out.println("Remove spaces String:"+str.trim());
		System.out.println("The second character is :"+str.charAt(2));
		System.out.println("Substring of 2 length   "+str.substring(0,4));
		System.out.println("append string "+str.concat("B.Tech"));
	    System.out.println("check string contains or not "+str.contains("Bra"));
	    System.out.println("check wheather string is empty or not "+str.isEmpty());
	    System.out.println("Lower case is "+str.toLowerCase()+" Upper case is "+str.toUpperCase());
	}
	
	
	
	public static void main(String[] args) {
        //What happened with these String
		/*
		 * Here ,JVM create a String object and stores "Brajesh" in it.
		 * observe that we are not using new operator to create String.We are using Assignment operator.
		 * So after creating the String Object,JVM Uses a seperate block of memory which is called String constant pool.
		 * and Strore Object there.
		 */
		String str14="Brajesh";
		//What Happened with Below Statement
		/*
		 * When the below Statement is Executed by the JVM ,it searches in the String constant pool.
		 * to know whether  the object with same content is avaialable there or not.
		 * Since same object available there which is s14.
		 * then JVM does not create another object.it simply create another reference of  s15 and copies the reference number of str14 to str15.
		 * So Both String having same hashCode value.
		 */
		String str15="Brajesh";
		//after concatenation
		  concate(str14);//not change String due to property Immutable
		  System.out.println(str14);
		System.out.println(str14.hashCode()+"-----"+str15.hashCode());
		String str="Hello";
		/*
		 * What Happened with this below statement
		 * new operator is used to create the string object.In this case JVM always create new object with diffrenet hashCode.
		 */
		String s11=new String("Hello");
//		StringOperation(str);
		
	}
	
	//concatenates two String
	public static void concate(String s)
	{
		s=s+"Kumar";
	}

}
 