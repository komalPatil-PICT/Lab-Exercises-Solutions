package com.cg.trainig.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * The Class TimerThread.
 */
public class TimerThread extends Thread {
	
	/** The formatter. */
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
	
	/** The time. */
	LocalDateTime time;

	@Override
	public void run() {
		try {
			while (true) {
				time = LocalDateTime.now();
				System.out.println(formatter.format(time));
				Thread.sleep(10000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
