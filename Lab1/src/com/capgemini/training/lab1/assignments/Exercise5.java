package com.capgemini.training.lab1.assignments;

import java.util.Scanner;

/**
 * @author Komal Patil
 * Java program to calculate the sum of first n natural numbers which are divisible by 3 or 5.
 */

public class Exercise5 {
	private static Scanner sc = new Scanner(System.in);

	/**
	 * Calculates sum of the first n natural numbers which are divisible by 3 or 5.
	 *
	 * @param n the number
	 * @return the long sum of the first n natural numbers which are divisible by 3 or 5
	 */
	private long calculateSum(int n) {
		long sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String args[]) {
		System.out.print("Enter the limit: ");
		int n = sc.nextInt();
		Exercise5 obj = new Exercise5();
		long sum = obj.calculateSum(n);
		System.out.println("Sum of first n natural numbers which are divisible by 3 or 5 : "
						+ sum);
	}
}
