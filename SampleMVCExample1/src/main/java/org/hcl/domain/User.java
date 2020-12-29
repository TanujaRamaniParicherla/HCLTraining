package org.hcl.domain;

public class User {
	int id;
	String username,password,phonenumber,address;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(int id, String username, String password, String phonenumber, String address) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.phonenumber = phonenumber;
		this.address = address;
	}
	
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
