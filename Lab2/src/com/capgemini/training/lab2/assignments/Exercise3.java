package com.capgemini.training.lab2.assignments;

import java.util.*;

/**
 * @author Komal Patil
 * Java program to accept an integer array, 
 * reverse the numbers in the array and print the resulting array in sorted order.
 */

public class Exercise3 {
	private static Scanner sc = new Scanner(System.in);

	/**
	 * Returns the sorted array after reversing each element in the given array.
	 *
	 * @param arr the arr
	 * @return the sorted
	 */
	int[] getSorted(int[] arr) {
		// reversing the elements in the array
		for (int i = 0; i < arr.length; i++) {
			StringBuffer str = new StringBuffer(Integer.toString(arr[i]));
			arr[i] = Integer.parseInt(new String(str.reverse()));
		}
		
		// sorting array
		Arrays.sort(arr);
		return arr;
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String args[]) {
		Exercise3 obj = new Exercise3();

		System.out.print("Enter array size: ");
		int size = sc.nextInt();

		System.out.println("Enter array elements: ");
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int[] sorted = obj.getSorted(arr);

		System.out.println("Sorted Array: ");
		for (int i : sorted) {
			System.out.println(i);
		}
	}
}