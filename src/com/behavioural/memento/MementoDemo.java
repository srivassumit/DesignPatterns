package com.behavioural.memento;

/**
 * @author sumit
 *
 */
public class MementoDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("BEGIN TESTING MEMENTO PATTERN");
		System.out.println("");

		BookReader bookReader = new BookReader("Core PHP Programming, Third Edition", "103");
		BookMark bookMark = new BookMark(bookReader);

		System.out.println("(at beginning) bookReader title: " + bookReader.getTitle());
		System.out.println("(at beginning) bookReader page: " + bookReader.getPage());

		bookReader.setPage("104");
		bookMark.setPage(bookReader);
		System.out.println("(one page later) bookReader page: " + bookReader.getPage());

		bookReader.setPage("2005");
		System.out.println("(after typo) bookReader page: " + bookReader.getPage());

		bookMark.getPage(bookReader);
		System.out.println("(back to one page later) bookReader page: " + bookReader.getPage());
		System.out.println("");

		System.out.println("END TESTING MEMENTO PATTERN");
	}

}
