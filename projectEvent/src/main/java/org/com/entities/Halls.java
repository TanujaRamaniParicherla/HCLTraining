package org.com.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Halls {
	@Id
	@GeneratedValue(strategy =GenerationType.TABLE.IDENTITY )
	private Integer id;
	private String image;
	private String description;
	private int cost;
	public Halls() {
		// TODO Auto-generated constructor stub
	}
	public Halls(Integer id, String image, String description, int cost) {
		super();
		this.id = id;
		this.image = image;
		this.description = description;
		this.cost = cost;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	

}
