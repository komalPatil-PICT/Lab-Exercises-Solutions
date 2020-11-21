package com.capgemini.training.lab1.assignments;

import java.util.Scanner;

/**
 * The Class Exercise6.
 *
 * @author Komal Patil
 * Java program to find the difference between the sum of
 * the squares and the square of the sum of the first n natural numbers.
 */

public class Exercise6 {
	private static Scanner sc = new Scanner(System.in);
	
	/**
	 * Calculates difference between the sum of the squares and the 
	 * square of the sum of the first n natural numbers.
	 *
	 * @param n the number
	 * @return the long difference between sums
	 */
	public long calculateDifference(int n) {
		long sum = 0, sum1 = 0;

		for (int i = 1; i <= n; i++) {
			sum1 = sum1 + i;
			sum = sum + (i * i);
		}
		long dif = sum - (sum1 * sum1);

		return dif;
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		Exercise6 dif = new Exercise6();
		System.out.println("Difference :: " + dif.calculateDifference(n));
	}

}
