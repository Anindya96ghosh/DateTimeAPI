package com.datetime.api;

import java.time.LocalDate;

public class DateAddDays {
	LocalDate date;
	
	//method to create date by the use of LocalDate.of
	public DateAddDays(int day, int month, int yyyy) {
		date = LocalDate.of(yyyy,month,day);
	}
	
	//method to add days
	public LocalDate AddDays(int num) {
		LocalDate updated = date.plusDays(num);
		return updated;
		
	}
	
}
