package com.cg.training.client;

import java.util.Scanner;
import java.util.function.BiPredicate;
/**
 * 
 * @author Komal Patil
 * Write a method that uses lambda expression to accept username
 * and password and return true or false.
 */
public class Exercise3 {

	private static Scanner sc = new Scanner(System.in);
	static BiPredicate<String, String> authenticateUser = (username,
			password) -> (username.equals("admin") && password.equals("admin@123")) ? true : false;

	public static void main(String[] args) {
		System.out.println("Enter Username::");
		String username = sc.nextLine();

		System.out.println("Enter Password::");
		String password = sc.nextLine();

		System.out.println(
				authenticateUser.test(username, password) ? "Authenticated Successfully" : "Authentication failed");
	}
}
