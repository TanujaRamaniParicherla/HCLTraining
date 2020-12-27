package org.hcl.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@Component
public class MyController {
	MyService service;
	public MyController() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public MyController(MyService service) {
		super();
		this.service = service;
	}
	public MyService getService() {
		return service;
	}
	public void setService(MyService service) {
		this.service = service;
	}
	public void display()
	{
		System.out.println("Controller method");
		service.display();
	}

}
