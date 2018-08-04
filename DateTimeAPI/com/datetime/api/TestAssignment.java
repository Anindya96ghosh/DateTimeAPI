package com.datetime.api;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestAssignment {

	public static void main(String[] args) {
		
		
		//Creating an arraylist
		ArrayList<Assignment> arrayList = new ArrayList<>();
		
		//creating object array
		Assignment[] assignment = new Assignment[5];

		//assigning dates for the assignments
		LocalDate date;
		date= LocalDate.of(2018, 8, 20);
		
		assignment[0] = new Assignment("AI",date);
		
		date= LocalDate.of(2018, 8, 25);
		assignment[1] = new Assignment("DSP",date);
		
		date= LocalDate.of(2018, 8, 31);
		assignment[2] = new Assignment("PDS",date);
		
		date= LocalDate.of(2018, 9, 30);
		assignment[3] = new Assignment("ML",date);
		
		date= LocalDate.of(2018, 9, 15);
		assignment[4] = new Assignment("DWM",date);
		
		//adding to the array list
		for(int i =0; i< 5; i++)
			arrayList.add(assignment[i]);
		
		//displaying the list
		arrayList.stream().forEach(System.out::println);
		
		//removing from the list
		arrayList.remove(assignment[2]);
		System.out.println("=======================================================================");
		//printing the remaining list
		arrayList.stream().forEach(System.out::println);
	
		System.out.println("=======================================================================");
		
		//sorting the list based on the due date
		Comparator<Assignment> comparator = (arg0, arg1) -> arg0.getDueDate().compareTo(arg1.getDueDate());
		Collections.sort(arrayList, comparator);
		
		//printing the first element of the list
		System.out.println(arrayList.get(0));
	}

}
