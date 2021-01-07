package org.com.dao;

import java.util.List;

import org.com.entities.Halls;
import org.com.entities.RegisterHall;

public interface RegisterDao {
	public void insert(RegisterHall hall);
	List<RegisterHall> getAll();
}
