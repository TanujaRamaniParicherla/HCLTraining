package org.object.arraylist;
import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		int n;
		String name,option;
		double deposit,costPerDay;
		Scanner sc=new Scanner(System.in);
		ArrayList<ItemType> item = new ArrayList<ItemType>();
		System.out.println("How many number of user detail you want to enter: ");
		n=sc.nextInt();
		sc.nextLine();
		for (int i= 0; i < n; i++) {
			System.out.println("Name :");
			name = sc.nextLine();
			System.out.println("Deposit:");
			deposit=sc.nextDouble();
			System.out.println("Cost per Day:");
			costPerDay=sc.nextDouble();
			sc.nextLine();
			System.out.println("Do you want to continue?(y/n)");
			option = sc.nextLine();
			ItemType it=new ItemType();
			it.setName(name);
			it.setDeposit(deposit);
			it.setCostPerDay(costPerDay);
			item.add(it); 	
	}
	System.out.println("Name \tDeposit\t CostPerDay");
	for (int j = 0; j < item.size(); j++)
			System.out.print(item.get(j) + "\n");
}
}
