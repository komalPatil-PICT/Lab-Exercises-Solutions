package com.cg.training.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Komal Patil
 * The Class FilePrinter.
 *
 */

public class FilePrinter {
	private String fileName;
	
	/**
	 * Instantiates a new file printer.
	 */
	public FilePrinter() {}
	
	/**
	 * Instantiates a new file printer.
	 *
	 * @param fileName the file name
	 */
	public FilePrinter(String fileName) {
		this.fileName = fileName;
	}
	
	/**
	 * Returns the file contents formatted with line numbers.
	 *
	 * @return the string formatted as specified
	 */
	public String getFormattedFileContents() {
		BufferedReader bReader = null;
		FileReader reader = null;
		StringBuffer result = new StringBuffer();
		
		try
		{
			reader = new FileReader(new File(fileName));
			bReader = new BufferedReader(reader);
			String line;
			long count = 1L;
			
			while((line = bReader.readLine()) != null) {
				result.append(count++ + "\t" + line + "\n");				
			}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		finally {
			try 
			{
				reader.close();
				bReader.close();
			} 
			catch(IOException ee) {
				ee.printStackTrace();
			}
		}
		
		return new String(result);
	}
}
