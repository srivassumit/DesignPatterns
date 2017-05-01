package com.creational.abstractfactory;

/**
 * @author sumit
 *
 */
public class SamsMySQLBook extends AbstractMySQLBook {
	private String author;
	private String title;

	public SamsMySQLBook() {
		this.author = "Paul Dubois";
		this.title = "MySQL, 3rd Edition";
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}
}
