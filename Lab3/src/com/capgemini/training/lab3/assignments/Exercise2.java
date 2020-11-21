package com.capgemini.training.lab3.assignments;

import java.util.Scanner;

/**
 * @author Komal Patil
 * Java program to create the mirror image of a String as original_string|mirror_string.
 */

public class Exercise2 {
	private static Scanner sc = new Scanner(System.in);

	/**
	 * Accept String, return the result as original_string|mirror_string
	 *
	 * @param s the String to mirror
	 * @return the String result
	 */
	public static String getImage(String s) {
		StringBuffer sb = new StringBuffer(s);
		String mirror = s + "|" + new String(sb.reverse());
		return mirror;
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		System.out.print("Enter the string to mirror: ");
		String s = sc.nextLine();

		System.out.println("Mirroring Result: " + getImage(s));
	}
}
