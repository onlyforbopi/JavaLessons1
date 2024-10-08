package Lesson2;

import java.util.ArrayList;

public class Lesson2ControlBlocksSwitch {

	public static void SwitchEx1() {
		int day = 4;
		
		switch(day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		
		}
			
	}
	
	public static void SwitchEx2() {
		int day = 4;
		switch (day) {
		case 6:
			System.out.println("Today is Saturday");
			break;
		case 7:
			System.out.println("Today is Sunday");
			break;
		default:
			System.out.println("Weekday");
		}
	}

	public static void SwitchEx3() {
		int month = 8;
		String monthString;
		
		switch(month) {
		case 1: monthString = "January";
			break;
		case 2: monthString = "January";
			break;
		case 3: monthString = "January";
			break;
		case 4: monthString = "January";
			break;
		case 5: monthString = "January";
			break;
		case 6: monthString = "January";
			break;
		case 7: monthString = "January";
			break;
		case 8: monthString = "January";
			break;
		case 9: monthString = "January";
			break;
		case 10: monthString = "January";
			break;
		case 11: monthString = "January";
			break;
		case 12: monthString = "January";
			break;
		default: monthString = "Invalid month";
		break;
	
		}
		
		System.out.println(monthString);
	}

	public static void SwitchEx4() {
		ArrayList<String> futureMonths = new ArrayList<String>();
		int month = 8;
		switch (month) {
		case 1: futureMonths.add("January");
		case 2: futureMonths.add("February");
		case 3: futureMonths.add("March");
		case 4: futureMonths.add("April");
		case 5: futureMonths.add("May");
		case 6: futureMonths.add("June");
		case 7: futureMonths.add("July");
		case 8: futureMonths.add("August");
		case 9: futureMonths.add("September");
		case 10: futureMonths.add("October");
		case 11: futureMonths.add("November");
		case 12: futureMonths.add("December");
			break;
		default: 
			break;
		
		}
		
		if (futureMonths.isEmpty()) {
			System.out.println("Invalid month number");
		} else {
			for (String monthNameString : futureMonths) {
				System.out.println(monthNameString);
			}
		}
		
	}

	public static void SwitchEx5() {
		
		int month = 2;
		int year = 2000;
		int numDays = 0;
		
		switch(month) {
		case 1: case 3: case 5:
		case 7: case 8: case 10:
		case 12:
			numDays = 31;
			break;
		case 4: case 6:
		case 9: case 11:
			numDays = 30;
			break;
		case 2:
			if (((year % 4 == 0)&& !(year % 100 == 0)) || (year % 400 == 0)) {
				numDays = 29;
			} else {
				numDays = 28;
			}
			break;
		default:
			System.out.println("Invalid month");
			break;
		}
		
		System.out.println("Number of Days = " + numDays);
	}

	public static int getMonthNumber(String month) {
		int monthNumber = 0;
		if (month == null) {
			return monthNumber;
		}
		
		switch (month.toLowerCase()) {
		case "january":
			monthNumber = 1;
			break;
		case "february":
			monthNumber = 2;
			break;
		case "march":
			monthNumber = 3;
			break;
		case "april":
			monthNumber = 4;
			break;
		case "may":
			monthNumber = 5;
			break;
		case "June":
			monthNumber = 6;
			break;
		case "July":
			monthNumber = 7;
			break;
		case "august":
			monthNumber = 8;
			break;
		case "september":
			monthNumber = 9;
			break;
		case "october":
			monthNumber = 10;
			break;
		case "november":
			monthNumber = 11;
			break;
		case "december":
			monthNumber = 12;
			break;	
		}
		return monthNumber;
	}
	
	public static void SwitchEx6() {
		String month = "August";
		
		int returnedno = getMonthNumber(month);
		if (returnedno == 0) {
			System.out.println("Invalid Month");
		} else {
			System.out.println(returnedno);
		}
	}
}
