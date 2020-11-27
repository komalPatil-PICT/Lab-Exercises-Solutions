package com.cg.trainig.client;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.cg.trainig.service.CopyDataThread;

public class FileProgram {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String args[]) {
		FileReader fr;
		FileWriter fw;

		try {
			fr = new FileReader("source.txt");
			fw = new FileWriter("target.txt");
			CopyDataThread t1 = new CopyDataThread(fr, fw);
			t1.start();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
