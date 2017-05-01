package com.creational.abstractfactory;

/**
 * @author sumit
 *
 */
public class SamsBookFactory extends AbstractBookFactory {

	private String context = "Sams";

	@Override
	public AbstractBook makePHPBook() {
		return new SamsPHPBook();
	}

	@Override
	public AbstractBook makeSQLBook() {
		return new SamsMySQLBook();
	}

	public String getContext() {
		return context;
	}

}
