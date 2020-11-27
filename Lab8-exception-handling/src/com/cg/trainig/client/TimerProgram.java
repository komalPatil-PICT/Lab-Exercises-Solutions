package com.cg.trainig.client;

import com.cg.trainig.service.TimerThread;

/**
 * The Class TimerProgram.
 */
public class TimerProgram {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		TimerThread timerThread = new TimerThread();
		timerThread.start();
	}
}