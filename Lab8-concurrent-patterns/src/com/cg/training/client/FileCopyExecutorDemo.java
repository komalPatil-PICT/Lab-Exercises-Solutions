package com.cg.training.client;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.cg.training.service.FileCopyExecutor;

/**
 * @author Komal Patil
 * The Class FileCopyExecutorDemo.
 */
public class FileCopyExecutorDemo {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		FileReader reader = null;
		FileWriter writer = null;
		ExecutorService service = Executors.newSingleThreadExecutor();

		try {
			reader = new FileReader("source.txt");
			writer = new FileWriter("target.txt");
			service.execute(new FileCopyExecutor(reader, writer));
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		service.shutdown();
	}

}
