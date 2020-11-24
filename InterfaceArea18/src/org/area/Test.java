package org.area;


import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Polygon p;
		double l,b,a;
		System.out.println("Enter Breadth & Length Of Square :");
		l=sc.nextDouble();
		b=sc.nextDouble();
		System.out.println("Enter Side Value :");
		a=sc.nextDouble();
		p=new Rectangle(l,b);
		System.out.println("Perimeter of Rectangle:");
		System.out.println(p.calcPeri());
		System.out.println("Area of Rectangle:");
		System.out.println(p.calcArea());
		p=new Square(a);
		System.out.println("Perimeter of Square:");
		System.out.println(p.calcPeri());
		System.out.println("Area of Square:");
		System.out.println(p.calcArea());
		
		

	}

}
