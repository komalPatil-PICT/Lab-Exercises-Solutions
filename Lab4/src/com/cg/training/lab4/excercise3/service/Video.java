package com.cg.training.lab4.excercise3.service;

/**
 * The Class Video.
 * @author Komal Patil
 */

public class Video extends MediaItem
{
	private String director, genre;
	private int releaseYear;
	
	/**
	 * Instantiates a new video.
	 *
	 * @param idNum the item id
	 * @param title the item title
	 * @param numCopies the number of copies
	 * @param runtime the runtime
	 * @param director the director
	 * @param genre the genre
	 * @param releaseYear the release year
	 */
	public Video(int idNum, String title, int numCopies, int runtime, String director, String genre, int releaseYear) {
		super(idNum, title, numCopies, runtime);
		this.director = director;
		this.genre = genre;
		this.releaseYear = releaseYear;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	
	@Override
	public void print() 
	{
		super.print();
		System.out.println("Director: " + director);
		System.out.println("Genre: " + genre);
		System.out.println("Year of Release: " + releaseYear);
	}


}
