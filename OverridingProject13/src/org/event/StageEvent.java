package org.event;

public class StageEvent extends Event {
	int noOfShows, noOfSeatsPerShow;
	int revenue;

	public StageEvent(int noOfShows, int noOfSeatsPerShow) {

		this.noOfShows = noOfShows;
		this.noOfSeatsPerShow = noOfSeatsPerShow;
	}

	public int getNoOfShows() {
		return noOfShows;
	}

	public void setNoOfShows(int noOfShows) {
		this.noOfShows = noOfShows;
	}

	public int getNoOfSeatsPerShow() {
		return noOfSeatsPerShow;
	}

	public void setNoOfSeatsPerShow(int noOfSeatsPerShow) {
		this.noOfSeatsPerShow = noOfSeatsPerShow;
	}

	int projectedRevenue() {
		revenue = noOfShows * noOfSeatsPerShow;
		return revenue;
	}

}
