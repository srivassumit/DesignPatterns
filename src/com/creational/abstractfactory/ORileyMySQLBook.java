package com.creational.abstractfactory;

/**
 * @author sumit
 *
 */
public class ORileyMySQLBook extends AbstractMySQLBook {
	private String author;
	private String title;

	public ORileyMySQLBook() {
		this.author = "George Reese, Randy Jay Yarger, and Tim King";
		this.title = "Managing and Using MySQL";
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}
}
