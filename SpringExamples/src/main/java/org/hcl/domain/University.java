package org.hcl.domain;

import java.util.List;

public class University {
	private Integer id;
	private String name;
	private List<Course> coursesOffered;
	public University() {
		// TODO Auto-generated constructor stub
	}
	public University(Integer id, String name, List<Course> coursesOffered) {
		super();
		this.id = id;
		this.name = name;
		this.coursesOffered = coursesOffered;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Course> getCoursesOffered() {
		return coursesOffered;
	}
	public void setCoursesOffered(List<Course> coursesOffered) {
		this.coursesOffered = coursesOffered;
	}
	

}
