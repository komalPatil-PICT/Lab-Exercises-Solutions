package com.cg.trainig.client;

import java.util.Scanner;

import com.cg.trainig.exceptions.FullNameValidateException;

/**
 * The Class FullNameTester.
 * @author Komal Patil
 */

public class FullNameTester {
	private static Scanner sc = new Scanner(System.in);
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		try {
			System.out.println("Enter first name:");
			String fname = sc.nextLine();
			System.out.println("Enter last name :");
			String lname = sc.nextLine();

			if(fname.trim().isEmpty() && lname.trim().isEmpty()) {
				throw new FullNameValidateException("Your first name and last name should not be blank");
			}
			else
				System.out.println("Valid name");
		}catch(FullNameValidateException e)
		{
			e.printStackTrace();
		}

	}

}
