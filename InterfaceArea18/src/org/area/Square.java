package org.area;


public class Square implements Polygon {
	double a;

	public Square(double a) {
		super();
		this.a = a;
	}
	public double calcPeri()
	{
		double per=4*a;
		return per;
	}
	public double calcArea()
	{
		double area=a*a;
		return area;
	}

}

