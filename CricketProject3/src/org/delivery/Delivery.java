package org.delivery;


public class Delivery
{
	Long over,ball,runs;
	String batsman,bowler,nonStriker;
	Delivery(Long over,Long ball,Long runs,String batsman,String bowler,String nonStriker)
	{
		this.over=over;
		this.ball=ball;
		this.runs=runs;
		this.batsman=batsman;
		this.bowler=bowler;
		this.nonStriker=nonStriker;
	}	
	void displayDeliveryDetails()
	{
		System.out.println("Delivery Details:");
		System.out.println("over:"+over);
		System.out.println("ball:"+ball);
		System.out.println("runs:"+runs);
		System.out.println("batsman:"+batsman);
		System.out.println("bowler:"+bowler);
		System.out.println("nonStriker:"+nonStriker);
	}
}
