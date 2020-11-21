package com.capgemini.training.lab1.assignments;

import java.util.Scanner;

/**
 * @author Komal Patil 
 * Java program to generate Fibonacci series using both recursive and non-recursive methods.
 */

public class Exercise3 {
	private static Scanner sc = new Scanner(System.in);

	/**
	 * Generates the Fibonacci series without recursion.
	 * 
	 * @param n the number
	 *            
	 */
	public void fiboNonRec(int n) {
		int a = 1;
		int b = 1;
		int c = 0;
		while (c != n) {
			System.out.println(a);
			int temp = a + b;
			a = b;
			b = temp;

			c++;
		}

	}

	/**
	 * Generates the Fibonacci series using recursion.
	 * 
	 * @param n the number      
	 * @return the int
	 */
	int fiboRec(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return (fiboRec(n - 1) + fiboRec(n - 2));
	}

	/**
	 * The main method.
	 * 
	 * @param args the arguments
	 *            
	 */
	public static void main(String[] args) {

		Exercise3 obj = new Exercise3();
		System.out.print("Enter number of terms: ");
		int term = sc.nextInt();

		System.out.println("Fibonacci series without recursion: ");
		// without recursion
		obj.fiboNonRec(term);

		System.out.println("Fibonacci series using recursion: ");
		// using recursion
		for (int i = 1; i <= term; i++) {
			System.out.println(obj.fiboRec(i));
		}
	}

}
