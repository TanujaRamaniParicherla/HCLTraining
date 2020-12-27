package org.com.course;

import java.util.Comparator;

public class Sort implements Comparator<Course>{

	@Override
	public int compare(Course a, Course b) {
		return a.getPrice().compareTo(b.getPrice());
	}
	

}
