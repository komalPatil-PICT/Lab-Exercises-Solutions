package com.capgemini.training.lab1.assignments;

import java.util.Scanner;

/**
 * @author Komal Patil 
 * Java program to find the sum of the cubes of the digits of an n digit number.
 */

public class Exercise1 {
	private static Scanner sc = new Scanner(System.in);

	/**
	 * Calculates the sum of the cubes of the digits of the given number.
	 * 
	 * @param n the number
	 * @return the int sum of digits
	 */
	public int sumOfCubesOfDigit(int n) {
		int sum = 0;
		while (n != 0) {
			int r = n % 10;
			sum += (r * r * r);
			n = n / 10;
		}
		return sum;
	}

	/**
	 * The main method.
	 * 
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		System.out.print("Enter n digit number: ");
		int num = sc.nextInt();

		Exercise1 obj = new Exercise1();
		System.out.println("Sum of Cubes of digit is: "
				+ obj.sumOfCubesOfDigit(num));
	}
}
