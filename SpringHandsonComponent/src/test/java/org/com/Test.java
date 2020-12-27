package org.com;


import java.util.Scanner;

import org.com.config.AppConfig;
import org.com.ex.Owner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name,password and mobile number of the user");
		String name=sc.nextLine();
		String password=sc.nextLine();
		String mobile=sc.nextLine();
		Owner o=context.getBean(Owner.class);
		o.setName(name);
		o.setPassword(password);
		o.setMobilenumber(mobile);
		o.display();

	}

}
