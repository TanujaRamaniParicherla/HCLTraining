package org.event;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name, detail, ownerName;
		int noOfStall, noOfShows, noOfSeatsPerShow;
		System.out.println("Enter Name:");
		name = sc.nextLine();
		System.out.println("Enter Detail:");
		detail = sc.nextLine();
		System.out.println("Enter OwnerName:");
		ownerName = sc.nextLine();
		System.out.println("Entet no of stalls:");
		noOfStall = sc.nextInt();
		System.out.println("Enter no of shows:");
		noOfShows = sc.nextInt();
		System.out.println("Enter no of seats per show:");
		noOfSeatsPerShow = sc.nextInt();
		Event e;
		e = new Exhibition(noOfStall);
		System.out.println("Number of Stalls:" + e.projectedRevenue());
		e = new StageEvent(noOfShows, noOfSeatsPerShow);
		System.out.println("revenue based on Shws and seats:" + e.projectedRevenue());

	}

}
