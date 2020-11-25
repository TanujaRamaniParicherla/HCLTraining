package org.numberformat;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		String name;
		String deposit,costPerDay;
		Scanner sc=new Scanner(System.in);
		
		try
		{
			System.out.println("Enter the Item type details:");
			System.out.println("Enter the name:");
			name=sc.nextLine();
			System.out.println("Enter the deposit:");
			deposit=sc.nextLine();
			Double d1=Double.valueOf(deposit);
			System.out.println("Enter the cost per day:");
			costPerDay=sc.nextLine();
			Double d2=Double.valueOf(costPerDay);
			ItemTypes i=new ItemTypes(name,deposit,costPerDay);
			System.out.println(i);
		}
		catch(NumberFormatException ne)
		{
			System.out.println(ne.toString());
		}
		
	}
	

}
