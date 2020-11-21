package com.capgemini.training.lab3.assignments;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Scanner;


/**
 * @author Komal Patil
 * Java program to accept date and print the duration in days, months 
 * and years with regards to current system date.
 */

public class Exercise7 {
	private static Scanner sc = new Scanner(System.in);

	/**
	 * Prints the duration in days, months and years from the given date 
	 * to current system date.
	 *
	 * @param d the Calendar date
	 */
	public static void printDate(Calendar d) {
		LocalDate start = LocalDate.of(d.get(Calendar.YEAR),
				d.get(Calendar.MONTH), d.get(Calendar.DAY_OF_MONTH));
		LocalDate end = LocalDate.now();

		Period period = start.until(end);

		System.out.println("Days: " + period.getDays());
		System.out.println("Months: " + (period.getMonths()-1));
		System.out.println("Years: " + period.getYears());
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		System.out
				.print("Enter date (before today's date in format 'dd/MM/yyyy'): ");
		String date = sc.nextLine();

		final DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		final Calendar c = Calendar.getInstance();

		try {
			c.setTime(df.parse(date));
			printDate(c);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
