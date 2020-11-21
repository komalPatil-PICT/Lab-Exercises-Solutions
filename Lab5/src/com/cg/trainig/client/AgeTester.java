package com.cg.trainig.client;

import java.util.Scanner;

import com.cg.trainig.exceptions.AgeException;

/**
 * The Class AgeTester.
 * @author Komal Patil
 */

public class AgeTester {
	private static Scanner sc = new Scanner(System.in);

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		try {
			System.out.println("Enter age:");
			int age = sc.nextInt();

			if (age < 15) {
				throw new AgeException("Sorry!!.. Your age is under 15");
			}
			System.out.println("Yes your age is above 15");
		} catch (AgeException e) {
			e.printStackTrace();
		}
	}

}
