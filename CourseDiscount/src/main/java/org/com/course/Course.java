package org.com.course;

import org.springframework.stereotype.Component;

@Component
public class Course {
	private String name,mentor;
	private Integer price;
	public Course() {
		// TODO Auto-generated constructor stub
	}
	public Course(String name, String mentor, Integer price) {
		super();
		this.name = name;
		this.mentor = mentor;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMentor() {
		return mentor;
	}
	public void setMentor(String mentor) {
		this.mentor = mentor;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	

}
