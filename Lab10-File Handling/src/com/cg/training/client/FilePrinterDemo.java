package com.cg.training.client;

import com.cg.training.service.FilePrinter;

/**
 * @author Komal Patil
 * The FilePrinterDemo Class.
 * 
 * Write a Java program that reads a file and displays the file on the screen, with a line
 * number before each line.
 */

public class FilePrinterDemo {

	public static void main(String[] args) {
		FilePrinter filePrinter = new FilePrinter("source.txt");
		System.out.println("\tFile contents with line numbers: ");
		System.out.println("------------------------------------------------------------------------");
		System.out.println(filePrinter.getFormattedFileContents());
	}
}
