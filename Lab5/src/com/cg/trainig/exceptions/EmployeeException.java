package com.cg.trainig.exceptions;


/**
 * The Class EmployeeException.
 * @author Komal Patil
 */

public class EmployeeException extends Exception{
	private String message;
	
	/**
	 * Instantiates a new employee exception.
	 */
	public EmployeeException() {
		
	}
	
	/**
	 * Instantiates a new employee exception.
	 *
	 * @param String the message
	 */
	public EmployeeException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
}
