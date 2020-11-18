import java.util.Scanner;
class Delivery
{
	Long over,ball,runs;
	String batsman,bowler,nonStriker;
	Delivery()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter over:");
		over=sc.nextLong();
		System.out.println("enter ball:");
		ball=sc.nextLong();
		System.out.println("enter runs:");
		runs=sc.nextLong();
		System.out.println("enter batsman:");
		batsman=sc.next();
		System.out.println("enter bowler:");
		bowler=sc.next();
		System.out.println("enter nonStriker:");
		nonStriker=sc.next();
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
class Main2
{
	public static void main(String[] args)
	{
		Delivery d=new Delivery();
		d.displayDeliveryDetails();
	}
}