package org.sort.hall;

public class Hall implements Comparable<Hall> {
	String name,contactNumber,ownerName;
	double costPerDay ;
	public Hall() {
		// TODO Auto-generated constructor stub
	}
	public Hall(String name, String contactNumber, String ownerName, double costPerDay) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.ownerName = ownerName;
		this.costPerDay = costPerDay;
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
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public double getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}
	@Override
	public int compareTo(Hall hl) {
		// TODO Auto-generated method stub
		if(costPerDay==hl.costPerDay)  
			return 0;  
			else if(costPerDay>hl.costPerDay)  
			return 1;  
			else  
			return -1;  
			}  
	    
	}
