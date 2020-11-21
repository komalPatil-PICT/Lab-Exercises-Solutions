package com.capgemini.training.lab3.assignments;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author Komal Patil
 * Java program to read a line of integers and then 
 * display each integer and the sum of all integers.
 */

public class Exercise1 {

	private static Scanner sc = new Scanner(System.in);
	
	
	/**
	 * Accepts string, separates each token in string using
	 * StringTokenizer, prints each number(token) then adds and return sum of numbers.
	 *
	 * @param s the string
	 * @return the int sum of numbers
	 */
	public static int sumOfTokens(String s) {
		int sum = 0;
		StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreTokens()) {
			String str = st.nextToken();
			System.out.println(str);
			sum += Integer.parseInt(str);
		}
		return sum;
	}

	public static void main(String[] args) {

		System.out.println("Enter numbers (saperated by space): ");
		String str = sc.nextLine();
		System.out.println("Sum of tokens is : " + sumOfTokens(str));
	}
}
