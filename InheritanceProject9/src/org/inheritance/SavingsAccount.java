package org.inheritance;

public class SavingsAccount extends Account {
	private String orgName;

	public SavingsAccount() {
		// TODO Auto-generated constructor stub
	}

	SavingsAccount(String accName, String accNo, String bankName, String orgName) {
		this.accName = accName;
		this.accNo = accNo;
		this.bankName = bankName;
		this.orgName = orgName;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public void display() {
		super.display();
		System.out.println("organization name:" + orgName);
	}
}
