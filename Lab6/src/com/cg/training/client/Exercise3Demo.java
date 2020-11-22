/**
 * 
 */
package com.cg.training.client;

import java.util.Map;
import java.util.Scanner;

import com.cg.training.service.Exercise3;

/**
 * @author Komal Patil
 * Demo class for exercise 3
 */
public class Exercise3Demo {

	/**
	 * @param args
	 */
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter size of array:");
		int size = Integer.parseInt(sc.nextLine());
		Integer[] arr = new Integer[size];
		
		System.out.println("Enter numbers in array :");
		for(int c=0;c<arr.length;c++)
		{
			arr[c]=Integer.parseInt(sc.nextLine());
		}
		
		System.out.println("Array elements with their squares:");
		Map<Integer,Integer> map= new Exercise3().getSquare(arr);
		for(Map.Entry<Integer,Integer> entry : map.entrySet())
		{
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}
	}

}
