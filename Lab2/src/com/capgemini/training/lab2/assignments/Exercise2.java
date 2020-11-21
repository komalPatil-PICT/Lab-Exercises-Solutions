package com.capgemini.training.lab2.assignments;

import java.util.*;

/**
 * @author Komal Patil
 *  
 * Java program to accept an array of String objects and
 * sort in alphabetical order. The elements in the left half should be
 * completely in upper case and the elements in the right half should be
 * completely in lower case. Note: If there are odd number of String
 * objects, then (n/2)+1 elements should be in UPPPERCASE.
 */

public class Exercise2 {
	private static Scanner br = new Scanner(System.in);

	/**
	 * Sorts strings as specified.
	 *
	 * @param arr the array
	 * @return the string[] as result after sort
	 */
	String[] sortStrings(String[] arr) {
		Arrays.sort(arr);
		int limit;
		int length = arr.length;
		
		// calculate upper case limit
		limit = (length % 2 == 1) ? length / 2 + 1 : length / 2;
		
		// converting left half to upper case
		for (int i = 0; i < limit; i++) {
			arr[i] = arr[i].toUpperCase();
		}
		
		//converting right half to lower case
		for (int i = limit; i < length; i++) {
			arr[i] = arr[i].toLowerCase();
		}

		return arr;
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String args[]) {
		Exercise2 obj = new Exercise2();

		System.out.print("Enter array size: ");
		int size = Integer.parseInt(br.nextLine());
		String[] arr = new String[size];

		System.out.println("Enter array elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = br.nextLine();
		}

		String[] sorted = obj.sortStrings(arr);

		System.out.println("Sorted Strings: ");
		for (String s : sorted) {
			System.out.println(s);
		}
	}
}