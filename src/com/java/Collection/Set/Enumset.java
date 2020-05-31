package com.java.Collection.Set;

import java.util.EnumSet;

/*
 * Enum Set
 */
enum Friends
{
	Brajesh,Ankit,Maneesh,Govind,Dheeraj;
}
public class Enumset {

	public static void main(String[] args) {
   /*
    * EnumSet is one of the specialized implementation of Set interface for use with the enumeration type
    * It extends AbstractSet and implements Set Interface in Java.
    * EnumSet class is a member of the Java Collections Framework & is not synchronized
    * All of the elements in an enum set must come from a single enumeration type that is specified when the set is created either explicitly or implicitly.
    */
		EnumSet<Friends> set1,set2,set3,set4;
		 // Adding elements 
        set1 = EnumSet.of(Friends.Brajesh, Friends.Maneesh,  
                           Friends.Dheeraj); 
        set2 = EnumSet.complementOf(set1); 
        set3 = EnumSet.allOf(Friends.class); 
        set4 = EnumSet.range(Friends.Brajesh, Friends.Brajesh); 
        System.out.println("Set 1: " + set1); 
        System.out.println("Set 2: " + set2); 
        System.out.println("Set 3: " + set3); 
        System.out.println("Set 4: " + set4); 
	}

}
