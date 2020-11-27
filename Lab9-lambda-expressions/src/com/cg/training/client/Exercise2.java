package com.cg.training.client;

import java.util.Optional;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * @author Komal Patil 
 * Write a method that uses lambda expression to format a
 * given string, where a space is inserted between each character of
 * string. For ex., if input is “CG”, then expected output is “C G”.
 */
public class Exercise2 {

	private static Scanner sc = new Scanner(System.in);
	static Consumer<String> formatString = (str) -> {
		Optional<String> result = Stream.of(str.split("(?!^)")).reduce((s1, s2) -> s1 + " " + s2);

		result.ifPresent(System.out::println);
	};

	public static void main(String[] args) {

		String str = "Komal Patil";
		formatString.accept(str);

	}

}
