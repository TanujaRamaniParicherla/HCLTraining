package org.multilevel;




import java.util.Scanner;
public class Test {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String detail;
		AccountBo ab=new AccountBo();
		System.out.println("accountNumber,balance,accountHolderName,minimunBalance,lockingPeriod");
		detail=sc.nextLine();
		ab.getAccountDetail(detail);
	}

}