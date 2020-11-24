package org.car;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String brand;
		int sum, years;
		Car c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your car number");
		sum = sc.nextInt();
		System.out.println("How many years old car do you have");
		years = sc.nextInt();
		sc.nextLine();
		System.out.println("Car Barnd");
		brand = sc.nextLine();
		c = new Service(brand, sum, years);
		c.sum();
		c.years();
		c.brand();

	}

}
