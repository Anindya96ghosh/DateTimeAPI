package com.datetime.api;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date as DDMMYYYY");
		String str = sc.nextLine();
		
		//foratting the Date using DateTimeFormatter
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
		
		LocalDate date = LocalDate.parse(str,formatter);
		
		System.out.println(date);
	}
}
