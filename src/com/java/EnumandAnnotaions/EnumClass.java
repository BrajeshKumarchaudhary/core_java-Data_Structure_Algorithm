package com.java.EnumandAnnotaions;

public class EnumClass {
 
public static void main(String[] args) {
	Days[] days=Days.values();
	for (Days days2 : days) {
		System.out.println(days2);		
	}
 
	
}
}

enum Days
{
  Monady,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunady;
}
