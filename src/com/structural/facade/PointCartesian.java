package com.structural.facade;

/**
 * @author sumit
 *
 */
public class PointCartesian {

	private double x, y;

	public PointCartesian(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void move(int x, int y) {
		this.x += x;
		this.y += y;
	}

	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
}
