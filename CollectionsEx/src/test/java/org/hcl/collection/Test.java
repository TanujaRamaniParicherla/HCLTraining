package org.hcl.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hcl.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		Scanner sc=new Scanner(System.in);
		ArrayList<String> mobile=new ArrayList<String>();
		System.out.println("Enter employee details");
		String name=sc.nextLine();
		String email=sc.nextLine();
		long salary=sc.nextLong();
		System.out.println("how many mobile numbers");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			String phone=sc.nextLine();
			mobile.add(phone);
		}
		
		System.out.println("Enter address");
		String line1=sc.nextLine();
		String line2=sc.nextLine();
		String city=sc.nextLine();
		String pincode=sc.nextLine();
		//ApplicationContext context=new ClassPathXmlApplicationContext("spring-bean.xml");
		Employee e=context.getBean(Employee.class);
		Address a=context.getBean(Address.class);
		e.setEmployeeName(name);
		e.setEmployeeEmail(email);
		e.setEmployeeSalary(salary);
		e.setEmployeeMobileNumber(mobile);
		a.setLine1(line1);
		a.setLine2(line2);
		a.setCity(city);
		a.setPincode(pincode);
		Address a1=e.getAddress();
		ArrayList<String> m=e.getEmployeeMobileNumber();
		e.display();
		

	}

}
