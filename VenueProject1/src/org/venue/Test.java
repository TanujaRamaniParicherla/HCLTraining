package org.venue;

import java.util.Scanner;
public class Test {
	
		public static void main(String[] args)
		{
			String name,city;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter Venue name:");
			name=sc.nextLine();
			System.out.println("enter City name:");
			city=sc.nextLine();
			Venue v=new Venue(name,city);
			



		}
}

