package org.java8.features;

import java.util.*;

public class EmploTest {

	public static void main(String[] args) {
		ArrayList<Movie> l = new ArrayList<Movie>();
		populate(l);
		Consumer<Movie> c = m -> {
			System.out.println("Email Name:" + m.email);
			System.out.println("Password:" + m.password);

			System.out.println();
		};
		for (Movie m : l) {
			c.accept(m);

		}

	}

	public static void populate(ArrayList<Movie> l) {
		l.add(new Movie("tanu", "tanuja"));
		l.add(new Movie("Rayees", "Sharukh"));
		l.add(new Movie("Dangal", "Amee"));
		l.add(new Movie("Sultan", "Salman"));
	}

}