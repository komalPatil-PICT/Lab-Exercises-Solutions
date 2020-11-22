package com.cg.training.client;

import java.util.Map;
import java.util.Scanner;

import com.cg.training.service.Exercise2;

public class Exercise2Demo {

	private static Scanner sc = new Scanner(System.in);


	public static void main(String[] args) {

		System.out.println("Enter number of characters:");
		int no = Integer.parseInt(sc.nextLine());
		char[] ch = new char[no];

		System.out.println("Enter character array:");
		for (int i = 0; i < ch.length; i++) {
			ch[i] = sc.nextLine().charAt(0);
		}
		
		Map<Character,Integer> map = new Exercise2().countChars(ch);
		System.out.println("Occurences of characters");
		for(Map.Entry<Character,Integer> entry : map.entrySet())
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
	}

}
