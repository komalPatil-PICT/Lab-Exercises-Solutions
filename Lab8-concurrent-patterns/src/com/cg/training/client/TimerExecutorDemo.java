package com.cg.training.client;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.cg.training.service.TimerExecutor;

/**
 * The Class TimerExecutorDemo.
 */
public class TimerExecutorDemo {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		ExecutorService service = Executors.newSingleThreadExecutor();
		service.execute(new TimerExecutor());
	}
}
