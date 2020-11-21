package com.capgemini.training.lab1.assignments;

import java.util.Scanner;

/**
 * @author Komal Patil 
 * Java program to simulate traffic light.
 */

public class Exercise2 {

	/**
	 * The main method.
	 * 
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		char choice;

		do {
			System.out.println("Enter your choice as (r / g / y) [Press e to terminate]: ");
			choice = scanner.next().charAt(0);

			switch (choice) {
			case 'r':
				System.out.println("Stop");
				break;

			case 'g':
				System.out.println("Go");
				break;

			case 'y':
				System.out.println("Ready");
				break;

			}
		} while (choice != 'e');
		
		scanner.close();
	}

}
