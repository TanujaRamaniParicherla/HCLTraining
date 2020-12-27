package org.hcl.collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Address {
	private String line1,line2,city,pincode;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(String line1, String line2, String city, String pincode) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.pincode = pincode;
	}
	public String getLine1() {
		return line1;
	}
	
	public String getLine2() {
		return line2;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getPincode() {
		return pincode;
	}
	@Autowired
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public void display()
	{
		System.out.println(getLine1()+"\t"+getLine2()+"\t"+getCity()+"\t"+getPincode());
	}
}
