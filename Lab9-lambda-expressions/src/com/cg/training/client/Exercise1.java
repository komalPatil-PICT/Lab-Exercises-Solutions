package com.cg.training.client;

import java.util.Scanner;
import java.util.function.BiFunction;

/**
 * @author Komal Patil
 * Write a lambda expression which accepts x and y numbers and return x^y.
 */
public class Exercise1 {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	private static Scanner sc = new Scanner(System.in);
	static BiFunction<Integer,Integer,Double> power = (x, y) -> Math.pow(x,y);

	public static void main(String[] args) {
		
		System.out.println("Enter x (base): ");
		int x = Integer.parseInt(sc.nextLine());
		System.out.println("Enter y (exponent): ");
		int y = Integer.parseInt(sc.nextLine());
		
		System.out.println("x ^ y: " + power.apply(x, y));
	}

}
