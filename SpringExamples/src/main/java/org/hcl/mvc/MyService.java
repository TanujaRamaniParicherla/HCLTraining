package org.hcl.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@Component
public class MyService {
	MyDao dao;
	public MyService() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public MyService(MyDao dao) {
		super();
		this.dao = dao;
	}
	public MyDao getDao() {
		return dao;
	}
	public void setDao(MyDao dao) {
		this.dao = dao;
	}
	public void display()
	{
		System.out.println("Service method");
		dao.execute();
	}

}
