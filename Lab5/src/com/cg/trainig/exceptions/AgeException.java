package com.cg.trainig.exceptions;

/**
 * The Class AgeException.
 * @author Komal Patil
 */
public class AgeException extends Exception{
	private String message;
	
	/**
	 * Instantiates a new age exception.
	 */
	public AgeException() {
		
	}
	
	/**
	 * Instantiates a new age exception.
	 *
	 * @param String the message
	 */
	public AgeException(String message) {
		super();
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
	/**
	 * Sets the message.
	 *
	 * @param message the new message
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
