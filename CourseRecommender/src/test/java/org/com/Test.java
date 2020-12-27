package org.com;

import java.util.List;
import java.util.Scanner;


import org.com.course.Course;
import org.com.course.CourseList;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-bean.xml");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter budget");
		Integer budget=sc.nextInt();
		CourseList cl=context.getBean(CourseList.class);
		cl.recommender(budget);
		
		

	}

}
