/**
 * 
 */
package com.cg.training.client;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cg.training.service.Exercise4;

/**
 * @author Komal Patil
 *
 */
public class Exercise4Demo {

	/**
	 * @param args
	 */
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		HashMap<Long,String> hmap;
		HashMap<Long,Integer> gethmap = new HashMap<>();
		boolean check = true;
		do
		{
			System.out.println("Enter student's registration no:");
			Long regno=Long.parseLong(sc.nextLine());
			System.out.println("Enter student's marks");
			Integer marks =Integer.parseInt(sc.nextLine());
			
			gethmap.put(regno, marks);
			System.out.println("Do you want to enter next student's entry(y/n)");
			String ans = sc.nextLine();
			if(ans.equalsIgnoreCase("y"))
				continue;
			else
				break;
			
		}while(check);
		
		hmap = new Exercise4().getStudents(gethmap);
		
		System.out.println("Students with registration number and medals");
		for(Map.Entry<Long, String> entry : hmap.entrySet()) 
		{
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}

	}

}
