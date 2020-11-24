package org.player;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		String name, country, skill;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name:");
		name = sc.nextLine();
		System.out.println("Enter country:");
		country = sc.nextLine();
		System.out.println("Enter skill:");
		skill = sc.nextLine();
		Player p = new Player(name, country, skill);
	}
}
