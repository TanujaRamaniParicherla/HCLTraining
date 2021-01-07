package org.com.service;

import java.util.List;

import org.com.entities.Halls;
import org.com.entities.User;



public interface HallsService {
	List<Halls> getHalls();
	void delete(int id);
	public Halls update(Halls h);
	public Halls getHall(int id);
	public void insert(Halls h);
	

}
