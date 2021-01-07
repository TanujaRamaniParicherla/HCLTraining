package org.com.service;

import java.util.List;

import org.com.dao.HallDao;
import org.com.entities.Halls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class HallsServiceImpl implements HallsService {
	private HallDao dao;
	@Autowired
	public HallsServiceImpl(HallDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public List<Halls> getHalls() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Halls update(Halls h) {
		// TODO Auto-generated method stub
		return dao.update(h);
	}

	@Override
	public Halls getHall(int id) {
		// TODO Auto-generated method stub
		return dao.getHall(id);
	}

	@Override
	public void insert(Halls h) {
		dao.insert(h);
		
	}

	

}
