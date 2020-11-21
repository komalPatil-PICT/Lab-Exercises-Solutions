package com.cg.trainig.client;

import java.util.Scanner;
import com.cg.trainig.exceptions.EmployeeException;

/**
 * The Class AgeTester.
 * @author Komal Patil
 */

public class EmployeeSalaryTest {
	private static Scanner sc = new Scanner(System.in);

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		long sal;
		try {

			System.out.println("Enter employee salary:");
			sal = sc.nextLong();
			if (sal < 3000) {
				throw new EmployeeException(
						"Salary should not be less than 3000");
			} else {
				System.out.println("Your salary is : " + sal);
			}
		} catch (EmployeeException e) {
			e.printStackTrace();
		}

	}

}
