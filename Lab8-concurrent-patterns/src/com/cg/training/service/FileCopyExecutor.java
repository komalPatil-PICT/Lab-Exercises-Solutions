package com.cg.training.service;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Komal Patil
 * The Class FileCopyExecutor.
 */
public class FileCopyExecutor extends Thread {
	FileReader reader = null;
	FileWriter writer = null;

	/**
	 * Instantiates a new file copy executor.
	 *
	 * @param reader the reader
	 * @param writer the writer
	 */
	public FileCopyExecutor(FileReader reader, FileWriter writer) {
		this.reader = reader;
		this.writer = writer;
	}

	public void run() {
		int ch;
		int count = 0;

		try {
			while ((ch = reader.read()) != -1) {
				writer.write(ch);
				count++;

				if (count == 10) {
					System.out.println("10 characters are copied");
					count = 0;
					Thread.sleep(10000);
				}
			}
			reader.close();
			writer.close();
		}

		catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}

}
