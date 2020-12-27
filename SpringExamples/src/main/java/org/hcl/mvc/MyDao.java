package org.hcl.mvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public  class MyDao {
	
	public void execute()
	{
		System.out.println("executing dao");
	}
}
