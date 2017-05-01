package com.structural.facade;

/**
 * @author sumit
 *
 */
public class Line {

	Point origin, end;

	public Line(Point origin, Point end) {
		this.origin = origin;
		this.end = end;
	}

	public void move(int x, int y) {
		this.origin.move(x, y);
		this.end.move(x, y);
	}

	public void rotate(int angle) {
		this.end.rotate(angle, this.origin);
	}

	public String toString() {
		return "Origin is: " + this.origin + ", End is: " + this.end;
	}
}
