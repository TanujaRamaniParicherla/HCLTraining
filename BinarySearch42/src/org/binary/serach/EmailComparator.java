package org.binary.serach;

import java.util.Comparator;

public class EmailComparator implements Comparator<User> {


	@Override
	public int compare(User a, User b) {
		// TODO Auto-generated method stub
		return a.getEmail().compareTo(b.getEmail());
		
	}
	

}
