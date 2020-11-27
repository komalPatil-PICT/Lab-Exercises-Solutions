package com.cg.eis.exception;

/**
 * The Class EmployeeException.
 */
public class EmployeeException extends Exception{
	
	/** The message. */
	private String message;
	
	/**
	 * Instantiates a new employee exception.
	 */
	public EmployeeException() {
		super();
	}

	/**
	 * Instantiates a new employee exception.
	 *
	 * @param message the message
	 */
	public EmployeeException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.message+ "\n"+super.getMessage();
	}
	
	
}
