package com.structural.facade;

/**
 * @author sumit
 *
 */
public class Point {

	private PointCartesian pointCartesian;

	public Point(double x, double y) {
		this.pointCartesian = new PointCartesian(x, y);
	}

	public String toString() {
		return this.pointCartesian.toString();
	}

	public void move(int x, int y) {
		this.pointCartesian.move(x, y);
	}

	public void rotate(int angle, Point p) {
		double x = pointCartesian.getX() - p.pointCartesian.getX();
		double y = pointCartesian.getY() - p.pointCartesian.getY();
		PointPolar pointPolar = new PointPolar(Math.sqrt(x * x + y * y), Math.atan2(y, x) * 180 / Math.PI);
		pointPolar.rotate(angle);
		String polarStr = pointPolar.toString();
		System.out.println("Polar Point is: " + polarStr);
		int i = polarStr.indexOf("@");
		double r = Double.parseDouble(polarStr.substring(1, i));
		double a = Double.parseDouble(polarStr.substring(i + 1, polarStr.length() - 2));
		pointCartesian = new PointCartesian(r * Math.cos(a * Math.PI / 180) + p.pointCartesian.getX(),
				r * Math.sin(a * Math.PI / 180) + p.pointCartesian.getY());
	}
}
