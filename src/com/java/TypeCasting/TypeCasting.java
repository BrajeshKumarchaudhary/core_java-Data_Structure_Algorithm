package com.java.TypeCasting;
/*
 * Type Casting in java
 */
public class TypeCasting {

	public static void main(String[] args) {
    /*
     * When you assign value of one data type to another, the two types might not be compatible with each other.
     * Two Type of Type casting in java
     * a.Widening or Automatic Type Conversion or Implicit
     * b.Narrowing or Explicit Conversion
     */
      //Widening or Automatic Type Conversion or Implicit
		/*
		 *The two data types are compatible.
		 *When we assign value of a smaller data type to a bigger data type.
		 *Byte->Short->Int->Long->Float->Double
		 */
        int i=100;
        long d=(long)i;
        float n=(float)i;
        System.out.println("Int Value-"+i);
        System.out.println("Long Value-"+d);
        System.out.println("Float Value-"+n);
        
        //Narrowing or Explicit Conversion
        /*
         *If we want to assign a value of larger data type to a smaller data type we perform explicit type casting or narrowing.
         *This is useful for incompatible data types where automatic conversion cannot be done.
         *Double->Float->Long->Int->Short->Byte
         */
        double m=100.08;
        long b=(long)m;
        System.out.println("Explict--"+b);
	}

}
