package com.behavioural.memento;

/**
 * @author sumit
 *
 */
public class BookReader {

	private String title, page;

	public BookReader(String title, String page) {
		this.title = title;
		this.page = page;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}
}
