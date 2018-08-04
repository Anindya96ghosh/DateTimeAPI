package com.datetime.api;

import java.time.LocalDate;

public class DisplayToday {
	
	public static void main(String args[]) {
		LocalDate date;
		
		date = LocalDate.now(); //storing current date in object 'date'
		System.out.println(date.getDayOfWeek()+", "+date.getMonth()+" "+date.getDayOfMonth()+", "+date.getYear());
	}
}
