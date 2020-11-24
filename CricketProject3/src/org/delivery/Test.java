package org.delivery;

import java.util.Scanner;
public class Test {
	public static void main(String[] args)
	{
		Long over,ball,runs;
		String batsman,bowler,nonStriker;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter over:");
		over=sc.nextLong();
		System.out.println("enter ball:");
		ball=sc.nextLong();
		System.out.println("enter runs:");
		runs=sc.nextLong();
		sc.nextLine();
		System.out.println("enter batsman:");
		batsman=sc.nextLine();
		System.out.println("enter bowler:");
		bowler=sc.nextLine();
		System.out.println("enter nonStriker:");
		nonStriker=sc.nextLine();
		Delivery d=new Delivery(over,ball,runs,batsman,bowler,nonStriker);
		d.displayDeliveryDetails();
	}

}
