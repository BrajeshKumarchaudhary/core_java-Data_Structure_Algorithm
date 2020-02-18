package com.java.Problem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargeString {

	
	public static void sortString(String arr[])
	{
		List<String> list=Arrays.asList(arr);
		Collections.sort(list);
		System.out.print(list);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[]= {"1222222222222222","33333333333","444444444","166666666666666","11111111111111111111"};
		sortString(arr);

	}

}
