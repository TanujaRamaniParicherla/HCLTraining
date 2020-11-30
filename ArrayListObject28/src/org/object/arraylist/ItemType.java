package org.object.arraylist;

public class ItemType {
	private String name;
	 private double deposit,costPerDay;
	 public ItemType() {
		// TODO Auto-generated constructor stub
	}
	public ItemType(String name, double deposit, double costPerDay) {
		super();
		this.name = name;
		this.deposit = deposit;
		this.costPerDay = costPerDay;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	public double getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"\t"+deposit+"\t"+costPerDay;
		
	}
	

}
