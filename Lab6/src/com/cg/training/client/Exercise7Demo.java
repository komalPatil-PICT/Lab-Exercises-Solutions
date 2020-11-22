/**
 * 
 */
package com.cg.training.client;

import java.util.Scanner;

import com.cg.training.service.Exercise7;

/**
 * @author Komal Patil
 *
 */
public class Exercise7Demo {

	/**
	 * @param args
	 */
	private static Scanner sc =new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter array size: ");
		int size = sc.nextInt();
		System.out.println("Enter array elements: ");
		int[] arr = new int[size];

		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}

		int[] sorted = new Exercise7().getSorted(arr);

		System.out.println("Sorted Array after reversing numbers: ");
		for(int i: sorted)
		{
			System.out.println(i);
		}
	}

}
