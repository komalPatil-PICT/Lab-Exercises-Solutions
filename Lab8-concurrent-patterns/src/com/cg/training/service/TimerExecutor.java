package com.cg.training.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Komal Patil
 * The Class TimerExecutor.
 */
public class TimerExecutor implements Runnable{
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");  
	
	@Override
	public void run() {
		try {
			while(true) {
				 LocalDateTime now = LocalDateTime.now();
				 System.out.println(dtf.format(now));
				 Thread.sleep(10000);
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
