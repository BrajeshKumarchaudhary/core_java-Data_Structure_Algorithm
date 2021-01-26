package com.java.Problem;

import java.util.Calendar;
import java.util.UUID;

public class UniqueID {

	public UniqueID() {
	}

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(generateUniqueId());
		}
		
	}

	 public static String generateUniqueId() {      
	        UUID uniqueId = UUID.randomUUID();
	        String str=""+uniqueId+Calendar.MILLISECOND;        
	        int uid=str.hashCode();
	        String filterStr=""+uid;
	        str=filterStr.replaceAll("-", "");
	        return str;
	    }
	
}
