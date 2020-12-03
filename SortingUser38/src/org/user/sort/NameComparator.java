package org.user.sort;

import java.util.Comparator;

public class NameComparator implements Comparator<User> {

	@Override
	public int compare(User a, User b) {
		// TODO Auto-generated method stub
		return a.getName().compareTo(b.getName());
	}

}
