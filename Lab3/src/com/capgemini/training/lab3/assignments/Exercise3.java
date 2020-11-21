package com.capgemini.training.lab3.assignments;

import java.util.Scanner;

/**
 * @author Komal Patil
 * Java program to accept a String and 
 * replace all the consonants in the String with the next alphabet.
 */

public class Exercise3 {
	private static Scanner sc = new Scanner(System.in);

	/**
	 * Alters and returns String by replacing all the consonants
	 * in the String with the next alphabet.
	 *
	 * @param s the String
	 * @return the String result
	 */
	public static String alterString(String s) {
		String vowels = "AIOEUaeiou";
		StringBuffer modified = new StringBuffer();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			int charInt = (int) ch;
			// check if the character is consonant or vowel
			boolean isConsonant = !vowels.contains(Character.toString(ch));

			if (isConsonant) {
				if (Character.isUpperCase(ch)) {
					char modChar = (char) ((charInt + 1 - 65) % 26 + 65);
					modified.append(Character.toString(modChar));
				}

				else if (Character.isWhitespace(ch)) {
					modified.append(Character.toString(ch));
				}

				else {
					char modChar = (char) ((charInt + 1 - 97) % 26 + 97);
					modified.append(Character.toString(modChar));
				}
			}

			else {
				modified.append(Character.toString(ch));
			}
		}

		return new String(modified);
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		System.out.print("Enter the string: ");
		String s = sc.nextLine();
		System.out.println("Modified string: " + alterString(s));
	}
}
