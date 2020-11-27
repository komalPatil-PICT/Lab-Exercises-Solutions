package com.cg.trainig.service;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * The Class CopyDataThread.
 */
public class CopyDataThread extends Thread {
	private FileReader fr;
	private FileWriter fw;

	public CopyDataThread(FileReader fr, FileWriter fw) {
		this.fr = fr;
		this.fw = fw;
	}

	@Override
	public void run() {

		try {
			int count = 0;
			int ch;
			// FileReader Class which is subclass of InputSteamReader
			// InputStreamReader class converts Strings or character data
			// into Byte which are in form of integers.
			// so ch is of int type
			while ((ch = fr.read()) != -1) { // -1 indicates end-of-file (EOF)
				fw.write(ch);
				count++;

				if (count == 10) {
					System.out.println("10 charaters copied!");
					Thread.sleep(10000);
					count = 0;
				}
			}

		} catch (IOException e) {
			System.out.println(e);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
			}
		}
	}
}
