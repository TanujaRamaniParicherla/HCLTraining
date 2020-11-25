package org.venue1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		String name, city;
		int ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Venue name:");
		name = sc.nextLine();
		System.out.println("enter City name:");
		city = sc.nextLine();
		Venue v = new Venue();
		System.out.println("Venue Details:");
		v.setName(name);
		System.out.println("Venue is:"+v.getName());
		v.setCity(city);
		System.out.println("City is:"+v.getCity());
		System.out.println("verify and Update Venue Details:");
		System.out.println("Menu \r\n"
				+ "1.Update Venue Name \r\n"
				+ "2.Update City Name \r\n"
				+ "3.All informations Correct/Exit \r\n"
				+ "Type 1 or 2 or 3 ");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			String vna;
			System.out.println(" Enter Venue Details:");
			sc.nextLine();
			vna=sc.nextLine();
			v.setName(vna);
			System.out.println("Venue Details:");
			System.out.println("Venue is:"+v.getName());
			System.out.println("City is:"+v.getCity());
			break;
		case 2:
			String cit;
			System.out.println("Enter Venue Details:");
			sc.nextLine();
			cit=sc.nextLine();
			System.out.println("Venue Details:");
			System.out.println("Venue is:"+v.getName());
			v.setCity(cit);
			System.out.println("City is:"+v.getCity());
			break;
		case 3:
			System.out.println("Venue Details:");
			System.out.println("Venue is:"+v.getName());
			System.out.println("City is:"+v.getCity());
			break;
			
			
		}

	}
}
