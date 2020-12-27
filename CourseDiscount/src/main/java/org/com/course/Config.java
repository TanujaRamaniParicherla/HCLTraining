package org.com.course;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan (basePackages = {"org.com.course"})
public class Config {
	@Bean
	public Course getCourse()
	{
		Course c=new Course();
		return c;
	}
	@Bean
	public CourseList getAll()
	{
		CourseList cl=new CourseList();
		cl.getCourseList();
		return cl;
	}
}
