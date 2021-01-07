package org.com.service;

import java.util.List;

import org.com.entities.Halls;
import org.com.entities.RegisterHall;

public interface RegisterService {
	public void insert(RegisterHall hall);
	List<RegisterHall> getHalls();

}
