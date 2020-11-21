package com.cg.training.lab4.excercise3.service;

/**
 * The Class WrittenItem.
 * @author Komal Patil
 */

public  abstract class WrittenItem extends Item{
	private String author;
	
	/**
	 * Instantiates a new written item.
	 *
	 * @param idNum the item id
	 * @param title the item title
	 * @param numCopies the number of copies
	 * @param author the author
	 */
	public WrittenItem(int idNum, String title, int numCopies, String author) {
		super(idNum, title, numCopies);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public void print() 
	{
		super.print();
		System.out.println("Author: " + author);
	}

}
