package com.cg.training.client;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.cg.training.service.Exercise1;

public class Exercise1Demo {
	
	/**
	 * Accept keys(Integer) and values(String), stores into HashMap
	 * call the method of HashMapExe1 class
	 * 
	 */
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	
		boolean check = true;
		Exercise1 obj = new Exercise1();
		HashMap<Integer, String> hashMap = new HashMap<>();
		
		
		do {
			System.out.println("Enter Id :");
			Integer number = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Name :");
			String name = sc.nextLine();
			
			hashMap.put(number, name);
			
			System.out.println("Do you want to enter more records(y/n)");
			String ans = sc.nextLine();
			if(ans.equalsIgnoreCase("y"))
				continue;
			else
				break;
		}while(check);

		List<String> list = new Exercise1().getMapValues(hashMap);
		
		System.out.println("Sorted values from map:");
		for(String names: list )
		{
			System.out.println(names);
		}
		
	}

}
