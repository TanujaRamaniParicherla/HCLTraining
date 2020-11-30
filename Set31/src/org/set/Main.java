package org.set;
import java.util.*;
public class Main {
	public static void main(String[] args)
	{
	String name;
	String option;
	int n;
	Scanner sc = new Scanner(System.in);
	//ArrayList<String> a = new ArrayList<>();
	HashSet h=new HashSet();
	System.out.println("How many number of user detail you want to enter: ");
	n = sc.nextInt();
	sc.nextLine();
	for (int i = 0; i < n; i++) {
		System.out.println("Enter the username :");
		name = sc.nextLine();
		System.out.println("Do you want to continue?(y/n)");
		option = sc.nextLine();
		h.add(name);
		
	}
	System.out.println("The unique number of usernames is "+h.size());
	

}

}
