package org.com.course;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		double totalPrice=0;
		String name,mentor;
		 Integer price;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter how many details:");
		 int n=sc.nextInt();
		 sc.nextLine();
	//	ApplicationContext context=new ClassPathXmlApplicationContext("spring-bean.xml");
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		CourseList cl=context.getBean(CourseList.class);
		System.out.println("Details of courses");
		List<Course> list=new ArrayList<Course>();
		Course c=context.getBean(Course.class);
		 for(int i=0;i<n;i++)
		 {
			 System.out.println("Enter details of"+(i+1));
			 name=sc.nextLine();
			 mentor=sc.nextLine();
			 price=sc.nextInt();
			 sc.nextLine();
			 c.setName(name);
			 c.setMentor(mentor);
			 c.setPrice(price);
			 list.add(c);
			
		 }
		 list.stream().forEach(cour->{
			 System.out.println(c.getName());
		 });
		
	//	List<Course> courses=cl.getCourseList();
	//	System.out.println("the offred courses:");
	//	courses.stream().forEach(cour->{
		//	System.out.println(cour.getName()+"\t"+cour.getMentor()+"\t"+cour.getPrice());
			 
		//});
		//cl.discount();
		//System.out.println("Total Revenue:"+cl.revenue());
		
			
		
}
}