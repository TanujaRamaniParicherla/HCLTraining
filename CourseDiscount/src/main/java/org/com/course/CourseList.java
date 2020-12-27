package org.com.course;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class CourseList {
	List<Course> courseList;
	public CourseList() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public CourseList(List<Course> courseList) {
		super();
		this.courseList = courseList;
	}
	
	public List<Course> getCourseList() {
		return courseList;
	}
	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}
	public void insert(Course course)
	{
		courseList.add(course);
	}
	public void discount()
	{
		
		Course max = Collections.max(courseList, new Sort());
		int result1=(int) ((0.2)*max.getPrice());
		System.out.println(result1+"discount for"+max.getName());
		Course min = Collections.min(courseList, new Sort());
		int result2=(int) (0.05*min.getPrice());
		System.out.println(result2+"discount for"+min.getName());
	
	}
	public double revenue()
	{
		double totalPrice=0;
		for(Course co:courseList)
		{
			
			totalPrice=totalPrice+(co.getPrice()*40);
		}
		return totalPrice;
	}
	
}
