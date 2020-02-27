package com.java.Collection;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		DateFormat fmt=DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT, Locale.ENGLISH);
		String str=fmt.format(d);
		System.out.println(d);

	}

}
