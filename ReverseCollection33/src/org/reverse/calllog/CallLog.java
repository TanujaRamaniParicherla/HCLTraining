package org.reverse.calllog;



public class CallLog {
	String dialledNumber, duration, dialledDate,name;
	public CallLog() {
		// TODO Auto-generated constructor stub
	}
	public CallLog(String dialledNumber, String duration, String dialledDate,String name) {
		super();
		this.dialledNumber = dialledNumber;
		this.duration = duration;
		this.dialledDate = dialledDate;
		this.name=name;
	}
	public String getDialledNumber() {
		return dialledNumber;
	}
	public void setDialledNumber(String dialledNumber) {
		this.dialledNumber = dialledNumber;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getDialledDate() {
		return dialledDate;
	}
	public void setDialledDate(String dialledDate) {
		this.dialledDate = dialledDate;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return "\n"+getName()+"\t"+getDialledNumber()+"\t"+getDuration();
		//return super.toString();
	}
	
	
	
	

}
