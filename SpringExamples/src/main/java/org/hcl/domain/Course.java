package org.hcl.domain;

public class Course {
	private int cid;
	private String cname;
	private int cdur;
	public Course() {
		// TODO Auto-generated constructor stub
	}
	public Course(int cid, String cname, int cdur) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cdur = cdur;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCdur() {
		return cdur;
	}
	public void setCdur(int cdur) {
		this.cdur = cdur;
	}
	

}
