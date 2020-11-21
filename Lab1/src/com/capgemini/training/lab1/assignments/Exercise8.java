package com.capgemini.training.lab1.assignments;

import java.util.Scanner;

/**
 * @author Komal Patil 
 * Java program to check if a number is a power of two or not.
 */

public class Exercise8 {
	private static Scanner sc = new Scanner(System.in);

	/**
	 * Checks if number is power of two.
	 * 
	 * @param n the number
	 * @return true, if number is power of two
	 */
	public boolean checkNumber(int n) {

		while (n != 1) {
			if (n % 2 != 0)
				return false;

			n = n / 2;
		}
		return true;
	}

	/**
	 * The main method.
	 * 
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		System.out.print("Enter number: ");
		int n = sc.nextInt();

		Exercise8 obje = new Exercise8();
		boolean b = obje.checkNumber(n);

		if (b)
			System.out.println(n + " is a power of 2");
		else
			System.out.println(n + " is not a power of 2");

	}

}
