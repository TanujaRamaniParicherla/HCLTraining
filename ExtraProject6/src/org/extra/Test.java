package org.extra;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String details;
		ExtraType e = new ExtraType();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the extratype details:");
		details = sc.nextLine();
		System.out.println("ExtraType Details");
		String[] arrOfStr = details.split("#");
		e.setName(arrOfStr[0]);
		System.out.println("ExtraType:" + e.getName());
		long r = Long.parseLong(arrOfStr[1]);
		e.setRuns(r);
		System.out.println("Runs:" + e.getRuns());

	}

}
