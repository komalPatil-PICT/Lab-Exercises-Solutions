package com.cg.training.lab4.excercise3.service;

/**
 * The Class MediaItem.
 * @author Komal Patil
 */

public abstract class MediaItem extends Item
{
	private int runtime;
	
	/**
	 * Instantiates a new media item.
	 *
	 * @param idNum the item id
	 * @param title the item title
	 * @param numCopies the number of copies
	 * @param runtime the runtime
	 */
	public MediaItem(int idNum, String title, int numCopies, int runtime) {
		super(idNum, title, numCopies);
		this.runtime = runtime;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	
	@Override
	public void print() 
	{
		super.print();
		System.out.println("Runtime: " + runtime);
	}

}
