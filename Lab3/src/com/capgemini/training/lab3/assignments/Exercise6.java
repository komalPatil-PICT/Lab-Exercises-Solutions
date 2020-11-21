package com.capgemini.training.lab3.assignments;

import java.util.Scanner;

/**
 * @author Komal Patil
 * Java program to accept a String and check if it is a positive string. 
 * A string is considered a positive string, if on moving from left to right each character in 
 * the String comes after the previous characters in the Alphabetical order.
 * For Example: ANT.
 */

public class Exercise6 {
	private static Scanner sc = new Scanner(System.in);

	/**
	 * Checks if the given String is positive.
	 *
	 * @param s the String
	 * @return true, if String is positive
	 */
	public static boolean isPositive(String s) {
		boolean isPositive = true;

		for (int i = 0; i < s.length() - 1; i++) {
			int numChar1 = (int) s.charAt(i);
			int numChar2 = (int) s.charAt(i + 1);

			if (numChar2 < numChar1) {
				isPositive = false;
				break;
			}
		}

		return isPositive;
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		System.out.print("Enter the string for positive test: ");
		String s = sc.nextLine();

		if (isPositive(s))
			System.out.println(s + " is a Positive String.");
		else
			System.out.println(s + " is not a Positive String.");
	}

}
