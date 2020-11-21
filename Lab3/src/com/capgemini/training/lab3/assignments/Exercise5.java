package com.capgemini.training.lab3.assignments;

/**
 * @author Komal Patil
 * Java program to display the number of characters, lines and words in the text.
 */

public class Exercise5 {
	
	/**
	 * Prints the text info such as number of characters, 
	 * lines and words in the given String text.
	 *
	 * @param s the String text
	 */
	public static void printTextInfo(String s) {
		int charsCount = s.length();
		String[] words = s.split(" ");
		String[] lines = s.split("\n");

		System.out.println("Number of characters: " + charsCount);
		System.out.println("Number of words: " + words.length);
		System.out.println("Number of lines: " + lines.length);
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		printTextInfo("Hello \nWorld. This is a good code.");
	}
}
