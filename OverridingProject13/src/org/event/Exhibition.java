package org.event;

public class Exhibition extends Event {
	int noOfStall;

	Exhibition(int stall) {
		super();
		noOfStall = stall;
	}

	public int getNoOfStall() {
		return noOfStall;
	}

	public void setNoOfStall(int noOfStall) {
		this.noOfStall = noOfStall;
	}

	int projectedRevenue() {
		return noOfStall;
	}

}
