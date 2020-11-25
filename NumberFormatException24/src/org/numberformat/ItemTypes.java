package org.numberformat;

public class ItemTypes {
	String name;
	String deposit;
	String costPerDay;
	
	public ItemTypes(String name, String deposit, String costPerDay) {
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
	public String getDeposit() {
		return deposit;
	}
	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}
	public String getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(String costPerDay) {
		this.costPerDay = costPerDay;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println("The details of the item type are:");
		//System.out.println("Name:"+name);
		//System.out.println("Deposit:"+deposit);
		//System.out.println("Cost Per Day:"+costPerDay);
		
		 return "Name:"+name+"\n"+"Deposit:"+deposit+"\n"+"cost per day:"+costPerDay;  
		
	}
	

}
