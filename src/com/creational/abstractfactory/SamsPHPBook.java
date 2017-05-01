package com.creational.abstractfactory;

/**
 * @author sumit
 *
 */
public class SamsPHPBook extends AbstractPHPBook {
	private String author;
	private String title;

	public SamsPHPBook() {
		this.author = "George Schlossnagle";
		this.title = "Advanced PHP Programming";
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}
}
