package org.map;

import java.util.List;

public class Address  {
	String addressLine1,addressLine2,city,state;
	Integer pincode;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(String addressLine1, String addressLine2, String city, String state,Integr pincode) {
		super();
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.pincode=pincode;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return addressLine1+"\t"+addressLine2+"\t"+city+"\t"+state+"\t"+pincode;
	}
	
	

}
