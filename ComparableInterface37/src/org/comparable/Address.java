package org.comparable;

public class Address implements Comparable<Address>{
	String username,addressLine1,addressLine2;
	Integer pincode;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(String username, String addressLine1, String addressLine2, Integer pincode) {
		super();
		this.username = username;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.pincode = pincode;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	@Override
	public int compareTo(Address ad) {
		// TODO Auto-generated method stub
		int pincode = this.pincode.compareTo(ad.pincode);
	     //Sorting by first name if last name is same d
	     return pincode == 0 ? this.addressLine1.compareTo(ad.addressLine1) : pincode;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return username+"\t"+addressLine1+"\t"+addressLine2+"\t"+pincode;
	}
	

}
