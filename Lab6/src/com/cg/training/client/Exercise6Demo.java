/**
 * 
 */
package com.cg.training.client;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.cg.training.service.Exercise6;

/**
 * @author Komal Patil
 *
 */
public class Exercise6Demo {

	/**
	 * @param args
	 */
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		Map<Long,Integer> map = new HashMap<>();
		boolean check = true;
		do
		{
			System.out.println("Enter id:");
			Long id = Long.parseLong(sc.nextLine());
			System.out.println("Enter person Age:");
			Integer age = Integer.parseInt(sc.nextLine());
			
			map.put(id,age);
			
			System.out.println("Do you want to enter more entries(y/n):");
			String ans = sc.nextLine();
			
			if(ans.equalsIgnoreCase("y"))
				continue;
			else
				break;
		}while(check);
		
		List<Long> list = new Exercise6().votersList(map);
		
		System.out.println("Following is list of id's of person who are eligible for voting:");
		for(Long l : list)
		{
			System.out.println(l);
		}
	}

}
