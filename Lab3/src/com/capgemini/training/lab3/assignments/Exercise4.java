package com.capgemini.training.lab3.assignments;

import java.util.Scanner;

/**
 * @author Komal Patil
 * Java program to accept a number and modify it such that 
 * the each of the digit in the newly formed number is equal to the difference between 
 * two consecutive digits in the original number. The digit in the unit place can be left as it is. 
 */

public class Exercise4 {
	private static Scanner sc = new Scanner(System.in);

	/**
	 * Modifies the given number such that the each of the digit in 
	 * the newly formed number is equal to the difference between 
	 * two consecutive digits in the original number keeping unit place 
	 * as it is.
	 *
	 * @param n the number
	 * @return the int modified number
	 */
	public static int modifyNumber(int n) {
		StringBuffer sb = new StringBuffer();
		String str = Integer.toString(n);

		for (int i = 0; i < str.length() - 1; i++) {
			int num1 = Integer.parseInt(Character.toString(str.charAt(i)));
			int num2 = Integer.parseInt(Character.toString(str.charAt(i + 1)));
			
			// Obsoleting the difference
			sb.append(Integer.toString(Math.abs(num1 - num2)));
		}
		
		// appending unit place digit
		String strRes = new String(sb)
				+ Character.toString(str.charAt(str.length() - 1));

		int res = Integer.parseInt(strRes);
		return res;
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		System.out.print("Enter the number to be modified: ");
		int n = sc.nextInt();
		System.out.println("Modified number: " + modifyNumber(n));
	}
}
