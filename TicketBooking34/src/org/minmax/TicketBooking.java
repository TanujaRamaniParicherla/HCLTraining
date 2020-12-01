package org.minmax;

public class TicketBooking implements Comparable<TicketBooking>{
	String customerName;
	int price;
	public TicketBooking() {
		// TODO Auto-generated constructor stub
	}
	public TicketBooking(String customerName, int price) {
		super();
		this.customerName = customerName;
		this.price = price;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return customerName+"\t "+price;
	}
	@Override
	public int compareTo(TicketBooking tb) {
		// TODO Auto-generated method stub
		if(price==tb.price)  
			return 0;  
			else if(tb.price>tb.price)  
			return 1;  
			else  
			return -1;  
			}  
	}
	
	
	
	
	


