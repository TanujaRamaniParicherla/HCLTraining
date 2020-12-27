package org.com.ex;

import org.springframework.stereotype.Component;

@Component
public class Owner {
	private String name,password,mobilenumber;
	public Owner() {
		// TODO Auto-generated constructor stub
	}
	public Owner(String name, String password, String mobilenumber) {
		super();
		this.name = name;
		this.password = password;
		this.mobilenumber = mobilenumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public void display()
	{
		System.out.println(getName()+"\n"+getMobilenumber());
	}	
}
