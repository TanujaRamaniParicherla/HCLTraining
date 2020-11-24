package org.area;

public class Circle extends Shape {
	private double radius, area;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	/*
	 * public double computeArea() {
	 * 
	 * area=3.14 * radius * radius; return area;
	 * 
	 * }
	 */
	public void computeArea() {
		super.computeArea();
		area = 3.14 * radius * radius;
		System.out.println(area);
	}
}
