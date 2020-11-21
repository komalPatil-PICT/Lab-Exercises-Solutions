package com.capgemini.training.lab2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Komal Patil 
 * Java program to accept an integer array and removes all
 * the duplicates in the array and print the resulting array in descending order.
 */

public class Exercise4 {
	private static Scanner sc = new Scanner(System.in);
	
	/**
	 * Removes duplicates from the given array and return array sorted in descending order.
	 *
	 * @param arr the array
	 * @return the int[] as result
	 */
	int[] modifyArray(int[] arr) {
		// adding array elements to set to remove duplicates
		Set<Integer> set = new HashSet<Integer>();
		for (int i : arr) {
			set.add(i);
		}
		
		// converting Set to ArrayList
		List<Integer> list = new ArrayList<Integer>(set);
		// sorting ArrayList in descending order
		Collections.sort(list, Collections.reverseOrder());
		
		// converting ArrayList to array
		int a[] = new int[set.size()];
		int j = 0;
		for (Integer I : list) {
			a[j++] = I;
		}

		return a;
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String args[]) {
		Exercise4 obj = new Exercise4();

		System.out.print("Enter array size: ");
		int size = sc.nextInt();
		System.out.println("Enter array elements: ");
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int[] modified = obj.modifyArray(arr);

		System.out.println("Modified Array: ");
		for (int i : modified) {
			System.out.println(i);
		}
	}
}