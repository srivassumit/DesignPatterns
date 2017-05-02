package com.creational.prototype;

/**
 * @author Sumit
 *
 */
public class Sheep implements Animal {

	public Sheep() {
		System.err.println("Sheep is made");
	}

	@Override
	public Animal makeCopy() {
		System.err.println("Sheep is being made");
		Sheep sheep = null;
		try {
			sheep = (Sheep) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return sheep;
	}

	public String toString() {
		return "Sheepy Sheep. Baaaa!";
	}

}
