package org.details;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Delivery d = new Delivery();
		Scanner sc = new Scanner(System.in);
		String batsman, bowler, nonStriker;
		Long over, ball, runs;
		System.out.println("enter over:");
		over = sc.nextLong();
		System.out.println("enter ball:");
		ball = sc.nextLong();
		System.out.println("enter runs:");
		runs = sc.nextLong();
		sc.nextLine();
		System.out.println("enter batsman:");
		batsman = sc.nextLine();
		System.out.println("enter bowler:");
		bowler = sc.nextLine();
		System.out.println("enter nonStriker:");
		nonStriker = sc.nextLine();
		d.setOver(over);
		d.setBall(ball);
		d.setRuns(runs);
		d.setBatsman(batsman);
		d.setBowler(bowler);
		d.setNonStriker(nonStriker);
		System.out.println("Over:" + d.getOver());
		System.out.println("Ball:" + d.getBall());
		System.out.println("Runs:" + d.getRuns());
		System.out.println("Batsman:" + d.getBatsman());
		System.out.println("Bowler:" + d.getBowler());
		System.out.println("NonStriker:" + d.getNonStriker());

	}

}
