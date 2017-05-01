package com.creational.abstractfactory;

/**
 * @author sumit
 *
 */
public class AbstractFactoryDemo {

	public static void main(String[] args) {
		System.out.println("BEGIN TESTING ABSTRACT FACTORY PATTERN");

		System.out.println("testing OReillyBookFactory");
		AbstractBookFactory oRileyFactoryInstance = new ORileyBookFactory();
		testBookFactory(oRileyFactoryInstance);

		System.out.println("testing SamsBookFactory");
		AbstractBookFactory samsFactoryInstance = new SamsBookFactory();
		testBookFactory(samsFactoryInstance);

		System.out.println("END TESTING ABSTRACT FACTORY PATTERN");
	}

	private static void testBookFactory(AbstractBookFactory factoryInstance) {
		AbstractBook phpBook = factoryInstance.makePHPBook();
		System.out.println("Author: " + phpBook.getAuthor() + ", Title: " + phpBook.getTitle());
		AbstractBook sqlBook = factoryInstance.makeSQLBook();
		System.out.println("Author: " + sqlBook.getAuthor() + ", Title: " + sqlBook.getTitle());
	}

}
