package org.multilevel;


public class AccountBo extends FixedAccount{
	String detail;
	public  void getAccountDetail(String detail)
	{
		FixedAccount fa=new FixedAccount();
		this.detail=detail;
		System.out.println("Account Details:");
		String[] arr =detail.split(",");
		fa.setAccountNumber(arr[0]);
		fa.setBalance(Double.valueOf(arr[1]));
		fa.setAccountHolderName(arr[2]);
		fa.setMinimunBalance(Double.valueOf(arr[3]));
		fa.setLockingPeriod(Integer.valueOf(arr[4]));
		System.out.println("AccountNumber\t"+ "Balance\t"+"AccountHolderName\t"+"MinimumBalanc\t"+"LockingPeriod");
		System.out.println(fa.getAccountNumber()+"\t\t"+fa.getMinimunBalance()+"\t\t"+fa.getAccountHolderName()+"\t\t"+fa.getMinimunBalance()+"\t\t"+fa.getLockingPeriod());

		
	}

	
	
}
	