package org.com.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RegisterHall {
	@Id
	private String name;
	private Integer HallId;
	private String HallType;
	public RegisterHall() {
		// TODO Auto-generated constructor stub
	}
	public RegisterHall(String name, Integer hallId, String hallType) {
		super();
		this.name = name;
		HallId = hallId;
		HallType = hallType;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getHallId() {
		return HallId;
	}
	public void setHallId(Integer hallId) {
		HallId = hallId;
	}
	public String getHallType() {
		return HallType;
	}
	public void setHallType(String hallType) {
		HallType = hallType;
	}
	
}
