package org.iterator.stall;

public class Stall {
	String name,detail,type,ownerName;
	public Stall() {
		// TODO Auto-generated constructor stub
	}
	
	public Stall(String detail, String type, String ownerName) {
		super();
		this.name=name;
		this.detail = detail;
		this.type = type;
		this.ownerName = ownerName;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"\t "+detail+"\t "+type+"\t"+ownerName;
	}

}
