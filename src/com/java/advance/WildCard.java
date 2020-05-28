package com.java.advance;

import java.util.Arrays;
import java.util.List;

public class WildCard {

	public static void main(String[] args) {
		//Three Type wildCard in java
		/*
		 * 1.UpperBound like List<? extends Number>
		 * 2.LowerBoud like List<? extends Integer>
		 * 3.NoBound like List<?>
		 */
         List<Integer> list=Arrays.asList(13,34,56,78,1,4);
        // list.stream().sorted().forEach(n->System.out.println(n));
        // System.out.println("Printing My Number");
         //list.forEach(n->{int sum=0;if(sum==0) {System.out.println(n);}});
//         list.stream().filter(e -> e % 2 == 0).forEach(n->System.out.println(n));
//         list.stream().filter(e -> e % 2 == 0).map(n->n*2).forEach(n->System.out.println(n));
         UpperBound.printList(list);
         List<String> list2=Arrays.asList("13","34","56","78");
         System.out.println("----------NoBound--------");
         NoBound.printList(list2);
		
	}

}
class UpperBound{
	public static void printList(List<? extends Number> list)
	{
		list.forEach(n->System.out.println(n));
	   	
	}
	
}

class LowerBound{
    public void printList(List<? extends Integer> list)
    {
    	list.forEach(n->System.out.println(n));
    }
}
class NoBound{
	public static void printList(List<?> list)
	{
		list.forEach(n->System.out.println(n));
//		list.forEach(n->{ if (n%2==0) System.out.println(n);});
//		list.forEach(n -> { if (n%2 == 0) System.out.println(n); });
		
    } 
}
