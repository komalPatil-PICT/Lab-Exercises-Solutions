package com.cg.trainig.exceptions;

/**
 * The Class FullNameValidateException.
 * @author Komal Patil
 */

public class FullNameValidateException extends Exception {
	private String message;
	
	/**
	 * Instantiates a new full name validate exception.
	 */
	FullNameValidateException(){
		
	}

	/**
	 * Instantiates a new full name validate exception.
	 *
	 * @param message the message
	 */
	public FullNameValidateException(String message) {
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
