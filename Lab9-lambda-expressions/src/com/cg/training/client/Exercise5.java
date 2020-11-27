package com.cg.training.client;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.LongStream;

public class Exercise5 {

	private static Scanner sc = new Scanner(System.in);
	
	static Consumer<Integer> factorial = (number)->
		LongStream.range(1,number+1)
		.reduce((n1,n2)-> n1*n2)
		.ifPresent(System.out::println);
	
	public static void main(String[] args) {

		System.out.println("Enter number:");
		int no = sc.nextInt();
		
		factorial.accept(no);;
	}

}
