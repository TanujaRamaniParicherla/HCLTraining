package org.area;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int ch;
		Scanner sc = new Scanner(System.in);
		Shape s;
		System.out.println("Enter the shape\r\n" + "\r\n" + "1.Circle\r\n" + "\r\n" + "2.Rectangle\r\n" + "\r\n"
				+ "3.Triangle\r\n" + "\r\n");
		ch = sc.nextInt();
		switch (ch) {
		case 1:
			double radius;
			System.out.println("Enter Radius:");
			radius = sc.nextDouble();
			s = new Circle(radius);
			s.computeArea();
			break;
		case 2:
			double length, breadth;
			System.out.println("Enter lenght and breadth");
			length = sc.nextDouble();
			breadth = sc.nextDouble();
			s = new Rectangle(length, breadth);
			s.computeArea();

			break;
		case 3:
			double base, height;
			System.out.println("Enter Base and Height:");
			base = sc.nextDouble();
			height = sc.nextDouble();
			s = new Triangle(base, height);
			s.computeArea();
			break;
		}

	}

}
