package org.area;

public class Triangle extends Shape {
	private double base, height, area;

	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	/*
	 * public double computeArea() { area = (1/2) * (base * height); return area;
	 * 
	 * }
	 */
	public void computeArea() {
		super.computeArea();
		area = (1 / 2) * (base * height);
		System.out.println(area);
	}
}
