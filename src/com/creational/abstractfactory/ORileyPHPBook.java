package com.creational.abstractfactory;

/**
 * @author sumit
 *
 */
public class ORileyPHPBook extends AbstractPHPBook {
	private String author;
	private String title;

	public ORileyPHPBook() {
		this.author = "Rasmus Lerdorf and Kevin Tatroe";
		this.title = "Programming PHP";
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}
}
