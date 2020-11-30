package org.methods.arraylist;

public class User {
	String name,contactNumber,userName,email;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String name, String contactNumber, String userName, String email) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.userName = userName;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	void display(String name,String number,String userName,String email)
	{
		this.name=name;
		this.contactNumber=number;
		this.userName=userName;
		this.email=email;
		System.out.println(name+"\t"+number+"\t"+userName+"\t"+email);
	}
	

	
}
