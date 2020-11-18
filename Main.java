import java.util.Scanner;
class Venue
{
	String name,city;
	Venue()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Venue name:");
		name=sc.nextLine();
		System.out.println("enter City name:");
		city=sc.nextLine();
		System.out.println("Venue Details:");
		System.out.println("Venue name:"+name);
		System.out.println("City name:"+city);
	}
}
class Main
{
	public static void main(String[] args)
	{
		Venue v=new Venue();
	}
}