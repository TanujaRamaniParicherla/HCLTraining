package org.wicket;


import java.util.Scanner;

public class Test {

	public static void main(String[] args)
	{
		String wicketType,playerName,bowlerName;
		Long over, ball ;
		String str1;
		int n;
		Delivery d=new Delivery();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of wickets:");
		n=sc.nextInt();
		sc.nextLine();
		String str[] = new String[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Details of Wicket"+(i+1));
			str1=sc.nextLine();
			str[i]=str1;
		}
		for(String a:str)
		{
			String[] arr=a.split(",");
			d.setOver(Long.valueOf(arr[0]));
			d.setBall(Long.valueOf(arr[1]));
			d.setWicketType(arr[2]);
			d.setPlayerName(arr[3]);
			d.setBowlerName(arr[4]);
			System.out.println("Over:"+d.getOver());
			System.out.println("Ball:"+d.getBall());
			System.out.println("WicketType:"+d.getWicketType());
			System.out.println("PlayerName:"+d.getPlayerName());
			System.out.println("BowlerName:"+d.getBowlerName());
		}
	}
}


sd
