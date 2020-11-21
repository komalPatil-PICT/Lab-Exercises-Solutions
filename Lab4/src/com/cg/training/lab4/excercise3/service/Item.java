package com.cg.training.lab4.excercise3.service;

/**
 * The Class Item.
 * @author Komal Patil
 */

public class Item {

	private int idNum;
	private String title;
	private int numCopies;
	
	/**
	 * Instantiates a new item.
	 *
	 * @param idNum the item id
	 * @param title the title
	 * @param numCopies the number of copies
	 */
	public Item(int idNum, String title, int numCopies){
		this.idNum = idNum;
		this.title = title;
		this.numCopies = numCopies;
	}
	
	public int getIdNum() {
		return idNum;
	}
	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getNumCopies() {
		return numCopies;
	}
	public void setNumCopies(int numCopies) {
		this.numCopies = numCopies;
	}
	
	/**
	 * Checks in the item.
	 */
	public void checkIn() {
		numCopies = numCopies + 1;
	}
	
	/**
	 * Checks out the item.
	 */
	public void checkOut() {
		numCopies = numCopies - 1;
	}
	
	@Override
	public String toString(){
		return "ID: " + idNum + " Title: " + title + " Number of Copies: " + numCopies;
	}
	
	public void print() {
		System.out.println("ID: " + idNum);
		System.out.println("Title: " + title);
		System.out.println("Number of copies: " + numCopies);
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj == null)
			return false;
		
		Item otherItem = (Item) obj;
		return idNum == otherItem.idNum && 
			   title == otherItem.title && 
			   numCopies == otherItem.numCopies;
	}
	
	/**
	 * Adds the item.
	 *
	 * @param idNum the item id
	 * @param sTitle the item title
	 * @param nCopies the number of copies
	 */
	public void addItem(int idNum, String sTitle, int nCopies) {
		setIdNum(idNum);
		setTitle(sTitle);
		setNumCopies(nCopies);
	}

}
