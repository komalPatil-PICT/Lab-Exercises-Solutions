package com.capgemini.training.lab1.assignments;

import java.util.Scanner;

/**
 * 
 * @author Komal Patil
 * Java program that prompts the user for an integer and then prints out all 
 * the prime numbers up to that integer.
 */

public class Exercise4 {
	private static Scanner sc = new Scanner(System.in);

	/**
	 * Prints the prime numbers up to given number.
	 *
	 * @param n the number
	 */
	public void printPrime(int n) {

		for (int i = 2; i <= n; i++) {
			int c = 2;
			while (i % c != 0) {
				c++;
			}
			if (i == c)
				System.out.println(i);
		}
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		Exercise4 obj = new Exercise4();
		System.out.print("Enter the limit: ");
		int n = sc.nextInt();

		obj.printPrime(n);
	}

}
