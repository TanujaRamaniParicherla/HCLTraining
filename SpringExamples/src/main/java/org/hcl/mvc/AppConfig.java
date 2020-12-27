package org.hcl.mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan (basePackages = {"org.hcl.mvc"})
public class AppConfig {
	/*@Bean
	public MyDao getdao()
	{
		MyDao dao=new MyDao();
		return dao;
	}
	@Bean
	public MyService getservice()
	{
		MyService service=new MyService();
		service.setDao(getdao());
		return service;
	}
	@Bean
	public MyController getController()
	{
		MyController controller=new MyController();
		controller.setService(getservice());
		return controller;
	}*/
}
