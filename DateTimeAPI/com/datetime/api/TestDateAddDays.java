package com.datetime.api;

import java.time.LocalDate;
import java.util.Scanner;

public class TestDateAddDays {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the date as DD/MM/YYYY");
		
		String str = scanner.nextLine();
		String[] date = str.split("/"); //splitiing the date on every occurance of'/' 
		
		
		DateAddDays day = new DateAddDays(Integer.parseInt(date[0]),Integer.parseInt(date[1]),Integer.parseInt(date[2]));
		
		System.out.println("Number of Days to be added");
		int num = scanner.nextInt();
		
		//adding days to the date stored in 'day'
		LocalDate newDate = day.AddDays(num);
		
		System.out.println(newDate.getDayOfMonth()+"/"+newDate.getMonthValue()+"/"+newDate.getYear());
	}

}
