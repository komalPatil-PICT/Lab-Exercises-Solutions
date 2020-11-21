package com.cg.training.lab4.excercise3.service;

/**
 * The Class JournalPaper.
 * @author Komal Patil
 */

public class JournalPaper extends WrittenItem
{
	private int year;
	
	/**
	 * Instantiates a new journal paper.
	 *
	 * @param idNum the item id
	 * @param title the item title
	 * @param numCopies the number of copies
	 * @param author the author
	 * @param year the year of publish
	 */
	public JournalPaper(int idNum, String title, int numCopies, String author, int year) {
		super(idNum, title, numCopies, author);
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public void print() 
	{
		super.print();
		System.out.println("Year: " + year);
	}

}
