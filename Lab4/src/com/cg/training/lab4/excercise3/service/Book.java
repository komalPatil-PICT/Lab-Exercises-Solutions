package com.cg.training.lab4.excercise3.service;

/**
 * The Class Book.
 * @author Komal Patil
 */

public class Book extends WrittenItem
{
	
	/**
	 * Instantiates a new book.
	 *
	 * @param idNum the item id 
	 * @param title the item title
	 * @param numCopies the number of copies
	 * @param author the author
	 */
	public Book(int idNum, String title, int numCopies, String author) {
		super(idNum, title, numCopies, author);
	}
}
