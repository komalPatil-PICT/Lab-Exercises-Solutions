/**
 * 
 */
package com.cg.training.client;

import java.util.Scanner;

import com.cg.training.service.Exercise5;

/**
 * @author Komal Patil
 *
 */
public class Exercise5Demo {

	/**
	 * @param args
	 */
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter array size:");
		int size = Integer.parseInt(sc.nextLine());
		
		int[] arr = new int[size];
		System.out.println("Enter array elements:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Integer.parseInt(sc.nextLine());
		}
		
		System.out.println("Second smallest number in array is: "+ new Exercise5().getSecondSmallest(arr));

	}

}
