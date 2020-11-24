package org.stall;


public class ExecutiveStall implements Stall{
	private String stallName,ownerName;
	private int cost,screen;
	public ExecutiveStall(String stallName, String ownerName, int cost, int screen) {
		super();
		this.stallName = stallName;
		this.ownerName = ownerName;
		this.cost = cost;
		this.screen = screen;
	}
	public String getStallName() {
		return stallName;
	}
	public void setStallName(String stallName) {
		this.stallName = stallName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getScreen() {
		return screen;
	}
	public void setScreen(int screen) {
		this.screen = screen;
	}
	public void display()
	{
		System.out.println("Stall name:"+stallName);
		System.out.println("Owner NAme:"+ownerName);
		System.out.println("Cost:"+cost);
		System.out.println("Screen:"+screen);
	}
	
}
