package com.java.Problem;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LargeString {

	
	public static void sortString(String arr[])
	{
		List<BigInteger> list=new LinkedList<BigInteger>();
		for(int i=0;i<arr.length;i++)
		{
			list.add(new BigInteger(arr[i]));
		}
		Collections.sort(list);
		System.out.print(list);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[]= {"111111111111111111111111111111111111111111",
				"666666666666666666666666666666666666666666666666666666666666666666666666666666666",
				"33333333333333333333333333333333333333333333333333",
				"22222222222222222222222222222222222222222222222222222",
				"0000000000000000000000000000000000000000000"};
		sortString(arr);

	}

}
