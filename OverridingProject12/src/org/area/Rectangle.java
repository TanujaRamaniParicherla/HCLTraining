package org.area;

public class Rectangle extends Shape {
	private double length, breadth, area;

	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	/*
	 * public double computeArea() {
	 * 
	 * area= (length * breadth); double roundOff = Math.round(area*100)/100D; return
	 * roundOff;
	 * 
	 * }
	 */
	public void computeArea() {
		super.computeArea();
		area = length * breadth;
		System.out.println(area);
	}

}
