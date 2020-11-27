package com.cg.training.service;

import java.io.File;

/**
 * 
 * @author Komal Patil
 * The FileAttributesLister Class.
 *
 */

public class FileAttributesLister {
	
	private String fileName;
	
	/**
	 * Instantiates a new file attributes lister.
	 */
	public FileAttributesLister() {}
	
	/**
	 * Instantiates a new file attributes lister.
	 *
	 * @param fileName the file name
	 */
	public FileAttributesLister(String fileName) {
		this.fileName = fileName;
	}
	
	/**
	 * Lists file attributes.
	 */
	public void listFileAttributes() {
		File file = new File(fileName);
		System.out.println("File related info.: ");
		System.out.println("------------------------------------------------------------------------");
		
		if(file.exists()) {
			System.out.println(fileName + " exists!");
			System.out.println(fileName + (file.canRead() ? " is readable." : " is not readable."));
			System.out.println(fileName + (file.canWrite() ? " is writable." : " is not writable."));
			
			int last = fileName.lastIndexOf(".");
			String extension = fileName.substring(last);
			System.out.println("File type: " + extension.toLowerCase());
			
			System.out.println("File size: " + file.length() + " bytes.");
		} 
		else {
			System.out.println(fileName + " doesn't exist!");
		}
	}
}
