package com.java.String.Problems;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class TimeZoneConvertor {

	public static void main(String[] args) {
		DateTimeFormatter formatter = new DateTimeFormatterBuilder()
			    .append(DateTimeFormatter.ISO_LOCAL_DATE)
			    .appendLiteral(' ')
			    .append(DateTimeFormatter.ISO_LOCAL_TIME)
			    .toFormatter();

                     String time="2020-06-18T12:34:53";		      
			LocalDateTime localDateTime = LocalDateTime.parse(time.replace("T", " "), formatter);
			ZoneId z =ZoneId.systemDefault() ;//get current serverZone
			ZonedDateTime calcuttaZonedDateTime = localDateTime.atZone(ZoneOffset.systemDefault())
			    .withZoneSameInstant(z);
			System.out.println(z);
			System.out.println(calcuttaZonedDateTime.format(formatter));
	}

}
