package org.area;


public class Rectangle implements Polygon {
	private double l,b;
	
	public Rectangle(double l, double b) {
		super();
		this.l = l;
		this.b = b;
	}
	public double calcPeri()
	{
		double per=2*(l+b);
		return per;
	}
	public double calcArea()
	{
		double area=l*b;
		return area;
	}

}

