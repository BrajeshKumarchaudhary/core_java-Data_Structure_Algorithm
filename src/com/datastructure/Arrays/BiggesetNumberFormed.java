package com.datastructure.Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class BiggesetNumberFormed {

	public static void main(String[] args) {
		List<String> numbers = new LinkedList<String>();
		numbers.add("54");
		numbers.add("546");
		numbers.add("548");
		numbers.add("60");
		Collections.sort(numbers, new Comparator<String>() {
			// A comparison function which is used by
            // sort() in printLargest()
            @Override 
            public int compare(String X, String Y)
            {
 
                // first append Y at the end of X
                String XY = X + Y;
 
                // then append X at the end of Y
                String YX = Y + X;
 
                // Now see which of the two
                // formed numbers
                // is greater
                return XY.compareTo(YX) > 0 ? -1 : 1;
            }
		});
		
		numbers.forEach(n->{
			System.out.print(n);
		});
	}

}
