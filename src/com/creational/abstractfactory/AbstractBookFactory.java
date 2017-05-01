package com.creational.abstractfactory;

/**
 * @author sumit
 *
 */
public abstract class AbstractBookFactory {
	public abstract AbstractBook makePHPBook();
	public abstract AbstractBook makeSQLBook();
}
