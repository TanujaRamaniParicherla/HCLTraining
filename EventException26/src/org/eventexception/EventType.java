package org.eventexception;

public class EventType extends Event {
	private long  id;
	private String name;
	public EventType() {
		// TODO Auto-generated constructor stub
	}
	public EventType(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
		
		return name+"\t "+detail+"\t"+ownerName+"\t "+id; 
		 
	}
	
	


}
