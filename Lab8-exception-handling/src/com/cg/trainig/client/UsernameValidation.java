package com.cg.trainig.client;

import java.util.Scanner;
/**
 * 
 * @author Komal Patil
 *You are asked to create an application for registering the details of jobseeker. 
 *The requirement is: Username should always end with _job and there should be at least 
 *minimum of 8 characters to the left of _job. Write a function to validate the same. 
 *Return true in case the validation is passed. In case of validation failure return false.
 */
public class UsernameValidation {

	private static Scanner sc = new Scanner(System.in);
	private static Boolean validateUsername(String uname)
	{
		if(uname.endsWith("_job") && (uname.length()-4) >= 8)
			return true;
		else
			return false;
			//System.out.println();
	}
	public static void main(String[] args) {
		
		System.out.println("Enter Username : ");
		String name = sc.nextLine();
		if(validateUsername(name))
		{
			System.out.println("Username Validated !!!");
		}
		else
			System.out.println("Invalidate username... ");

	}

}
