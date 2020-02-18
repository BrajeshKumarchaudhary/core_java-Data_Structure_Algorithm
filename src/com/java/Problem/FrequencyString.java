package com.java.Problem;

import java.util.HashMap;

public class FrequencyString {
 
	
	public static void checkFrequency(String st)
	{
		char value[]=st.toCharArray();
		HashMap<Character, Integer> result=new HashMap<>();
		for (int i=0;i<value.length;i++) {
			if(result.containsKey(value[i]))
			{
				Integer temp=result.get(value[i]);
				System.out.print("--"+temp);
				result.put(value[i], temp+1);
			}
			else
			{
				result.put(value[i], 0);
			}
		}
		
		printResult(result);
	}
	
	public static void printResult(HashMap<Character, Integer> map)
	{
		map.forEach((k,v) ->
				System.out.println(k+"="+v));
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="123312345690000011111nvvnwvwrv";
		checkFrequency(str);
		
		

	}

}
