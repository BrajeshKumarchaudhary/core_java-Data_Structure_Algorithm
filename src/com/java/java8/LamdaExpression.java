package com.java.java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LamdaExpression {
    /*
     * The Expression through which we can represent an Anynoymous function.
     * Anynonymous:Nameless/Unknown.
     * Syntax.   Parameter    Expression      Body
     *            ()             ->           {}
     */
	public static void main(String[] args) {
		List<String> names=Arrays.asList("Brajesh","Ankit","Maneesh","Dheeraj","Govind");
  		methodSort1(names);
         
	}
    @SuppressWarnings("unchecked")
	public static void methodSort1(List list)
    {
    	Collections.sort(list,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
    }
    @SuppressWarnings("unchecked")
	public static void methodSort2(List list)
    {
    	Collections.sort(list,(String o1,String o2)-> {
				return o1.compareTo(o2);
		});
    }
 
}
