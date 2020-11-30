package org.arraylist;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String option;
		int n;
		Scanner sc = new Scanner(System.in);
		ArrayList<String> a = new ArrayList<>();
		System.out.println("How many number of user detail you want to enter: ");
		n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the username :");
			name = sc.nextLine();
			System.out.println("Do you want to continue?(y/n)");
			option = sc.nextLine();
			a.add(name);
			
		}
		System.out.println("The Names Entered are:");
		for (int j = 0; j < a.size(); j++)
			System.out.print(a.get(j) + "\n");

	}

}
