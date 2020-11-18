import java.util.Scanner;
class Player
{
	String name,country,skill;
	Player()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:");
		name=sc.nextLine();
		System.out.println("Enter country:");
		country=sc.nextLine();
		System.out.println("Enter skill:");
		skill=sc.nextLine();
		System.out.println("Player Details:");
		System.out.println("Name:"+name);
		System.out.println("Country:"+country);
		System.out.println("Skill:"+skill);
	}
}
class Main1
{
	public static void main(String[] args)
	{
		Player p=new Player();
	}
}
	