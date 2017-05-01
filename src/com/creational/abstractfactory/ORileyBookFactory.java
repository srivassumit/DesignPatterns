package com.creational.abstractfactory;

/**
 * @author sumit
 *
 */
public class ORileyBookFactory extends AbstractBookFactory {

	private String context = "ORiley";

	@Override
	public AbstractBook makePHPBook() {
		return new ORileyPHPBook();
	}

	@Override
	public AbstractBook makeSQLBook() {
		return new ORileyMySQLBook();
	}

	public String getContext() {
		return context;
	}

}
