package com.behavioural.memento;

/**
 * @author sumit
 *
 */
public class BookMark {

	private String title, page;

	public BookMark(BookReader bookReader) {
		this.title = bookReader.getTitle();
		this.page = bookReader.getPage();
	}

	public void getTitle(BookReader bookReader) {
		bookReader.setTitle(this.title);
	}

	public void setTitle(BookReader bookReader) {
		this.title = bookReader.getTitle();
	}

	public void getPage(BookReader bookReader) {
		bookReader.setPage(this.page);
	}

	public void setPage(BookReader bookReader) {
		this.page = bookReader.getPage();
	}
}
