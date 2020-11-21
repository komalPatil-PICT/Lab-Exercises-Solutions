package com.capgemini.training.lab2.assignments;

import java.util.*;

/**
 * @author Komal Patil 
 * 
 * Java program to accept an array of integer elements and
 * print the second smallest element in the array.
 */

public class Exercise1 {
	private static Scanner sc = new Scanner(System.in);

	/**
	 * Gets the second smallest element in the array.
	 *
	 * @param a the array
	 * @return the second smallest element
	 */
	int getSecondSmallest(int[] a) {
		Arrays.sort(a);
		return (a[1]);
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String args[]) {
		Exercise1 obj = new Exercise1();

		System.out.print("Enter array size: ");
		int size = sc.nextInt();
		System.out.println("Enter array elements: ");
		int[] a = new int[size];

		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		int secondSmallest = obj.getSecondSmallest(a);
		System.out.println("Second smallest element is " + secondSmallest);
	}
}