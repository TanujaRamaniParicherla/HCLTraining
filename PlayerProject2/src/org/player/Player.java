package org.player;

public class Player {
	String name, country, skill;

	Player(String na, String coun, String ski) {
		this.name = na;
		this.country = coun;
		this.skill = ski;
		System.out.println("Player Details:");
		System.out.println("Name:" + na);
		System.out.println("Country:" + coun);
		System.out.println("Skill:" + ski);
	}

}
