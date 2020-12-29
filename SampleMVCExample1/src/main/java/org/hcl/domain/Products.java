package org.hcl.domain;

public class Products {
	int id;
	String name,reason;
	public Products() {
		// TODO Auto-generated constructor stub
	}
	public Products(int id, String name, String reason) {
		super();
		this.id = id;
		this.name = name;
		this.reason = reason;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

}
