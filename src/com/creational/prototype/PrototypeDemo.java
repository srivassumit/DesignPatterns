package com.creational.prototype;

/**
 * @author Sumit
 *
 */
public class PrototypeDemo {

	public static void main(String[] args) {
		System.out.println("Prototype Demo");
		CloneFactory animalFactory = new CloneFactory();

		Sheep sally = new Sheep();

		Sheep clonedSally = (Sheep) animalFactory.getClone(sally);

		System.out.println(sally);
		System.out.println(clonedSally);
		System.out.println("Sally Hash: " + System.identityHashCode(sally));
		System.out.println("Cloned Sally Hash: " + System.identityHashCode(clonedSally));
	}
}
