package org.java.listoflist;

import java.util.*;

public class MovieTickets {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<ArrayList<Integer> > aList =   new ArrayList<ArrayList<Integer> >(); 
		System.out.println("Enter the number of days");
		int n=sc.nextInt();
		sc.nextLine();
		for (byte i = 1; i <= n; i++) {
			ArrayList<Integer> showList = new ArrayList<>();
			System.out.println("On Day " + i);
			String st[] = sc.nextLine().split(",");
			for (byte j = 0; j < 4; j++)
				showList.add(100 - Integer.parseInt(st[j]));
			aList.add(showList);
		}
		String choice;
		do {
			System.out.println("Enter the day to know its remaining ticket count:");
			byte remainingTickets = sc.nextByte();
			sc.nextLine();
			System.out.println("Remaining tickets:" + aList.get(remainingTickets - 1));
			System.out.println("Do you want to continue?(y/n)");
			choice = sc.nextLine();
		} while (choice.equalsIgnoreCase("Y"));
    } 
	}

