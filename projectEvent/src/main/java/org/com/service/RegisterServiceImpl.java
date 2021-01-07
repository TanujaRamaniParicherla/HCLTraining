package org.com.service;

import java.util.List;

import org.com.dao.RegisterDao;
import org.com.entities.RegisterHall;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class RegisterServiceImpl implements RegisterService {
	private RegisterDao dao;
	
	public RegisterServiceImpl(RegisterDao dao) {
		super();
		this.dao = dao;
	}
	@Transactional
	@Override
	public void insert(RegisterHall hall) {
		dao.insert(hall);
	}
	@Override
	public List<RegisterHall> getHalls() {
		return dao.getAll();
	}

}
