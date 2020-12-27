package org.com.course;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class CourseList {
	List<Course> courseList;
	Integer budget;
	public CourseList() {
		// TODO Auto-generated constructor stub
	}
	
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
	public void recommender(Integer budget)
	{
		
		for(Course c:courseList)
		{
			if(c.getPrice()<=budget)
			{
				
				System.out.println(c.getName());
			}
			
			
		}
	}
}
