package com.cg.training.client;

import java.util.Scanner;

import com.cg.training.service.FileAttributesLister;

/**
 * @author Komal Patil
 * The Class FileAttributesListerDemo.
 * Java program that reads on file name from the user, then displays information 
 * about whether the file exists, whether the file is readable, whether the file is writable, 
 * the type of file and the length of the file in bytes
 */

public class FileAttributesListerDemo {
	
	private static Scanner sc = new Scanner(System.in);
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		System.out.print("Enter the full file path: ");
		String fileName = sc.nextLine();
		FileAttributesLister lister = new FileAttributesLister(fileName);
		lister.listFileAttributes();
	}

}
