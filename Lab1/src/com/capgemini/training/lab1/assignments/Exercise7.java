package com.capgemini.training.lab1.assignments;

import java.util.Scanner;

/**
 * 
 * @author Komal Patil
 * Java Program to check if a number is an increasing number.
 */

public class Exercise7 {
	private static Scanner sc = new Scanner(System.in);
	
	/**
	 * Checks if the number is increasing.
	 *
	 * @param num the number
	 * @return true, if number is increasing 
	 */
	public boolean checkNumber(int num) {
		boolean flag = false;

		int c = num % 10;
		num = num / 10;

		while (num > 0) {
			if (c <= num % 10) {
				flag = true;
				break;
			}
			c = num % 10;
			num = num / 10;

		}

		return flag;
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Exercise7 obj = new Exercise7();
		System.out.print("Enter number: ");
		int num = sc.nextInt();

		boolean ans = obj.checkNumber(num);

		if (ans)
			System.out.println("Number is not in increasing order");
		else
			System.out.println("Number is in increasing order");

	}

}
