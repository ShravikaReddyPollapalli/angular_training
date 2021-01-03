package com.capg.abhi.localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TestDate {
public static void main(String[] args) {
	LocalDate date = LocalDate.now();
	System.out.println(date);
	
	LocalTime time = LocalTime.now();
	System.out.println(time);
	
	LocalDateTime dateTime = LocalDateTime.now();
	System.out.println(dateTime);
	
	Date date2 = new Date();
	System.out.println(date2);
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E,MMM dd yyyy 'T' hh:mm a");
	System.out.println(formatter.format(dateTime));
}
}
