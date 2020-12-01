package com.java.Problem;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ActiveTraders {

	public static List<String> mostActive(List<String> customers) {
	    // Write your code here
	       Map<String,Integer> freq=new HashMap<>();
	       int cust=customers.size();
	       customers.forEach(n->{
	            if(freq.containsKey(n)){
	                freq.put(n, freq.get(n)+1);
	            }else{
	                freq.put(n,1);
	            }
	       });
	       List<String> finalresult=new LinkedList<>();
	       freq.forEach((k,v)->{
	           float per=100/cust;
	           float gain=per*v;
	           System.out.println(gain);
	           if(gain>=5){
	              finalresult.add(k);
	           }           
	       });
	       Collections.sort(finalresult);
	       return finalresult;
	    }
	public static void main(String[] args) {
	String arr[]= {"Omega","Omega","Omega","Omega","Omega","Omega","Omega","Omega","Beta","alpha","gama","beta"};
	System.out.println(mostActive(Arrays.asList(arr)));
	}

}
