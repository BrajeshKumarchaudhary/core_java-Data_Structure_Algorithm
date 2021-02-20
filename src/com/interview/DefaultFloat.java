package com.interview;

public class DefaultFloat {
	static char c;
	static String STATIC1;
	static String static1;
    public static void test(float f) {
    	System.out.println("float");
    }
    
    public static void test(double f) {
    	System.out.println("double");
    }
	
    public static void test(long l) {
    	System.out.println("Long");
    }
    public static void test(int INTEGER) {
    	System.out.println("int");
    }
	

	

    
    
	public static void main(String[] args) {
            test(999.9);
            test(200000000000l);
            test(3333333333333l);
            System.out.println(c);
            System.out.println(STATIC1);
            int Integer=1;
            System.out.println(Integer);
	}

}
