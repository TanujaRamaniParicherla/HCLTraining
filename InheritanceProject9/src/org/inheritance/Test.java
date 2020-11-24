package org.inheritance;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int ch;
		CurrentAccount ca = new CurrentAccount();
		SavingsAccount sa = new SavingsAccount();
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose Account Type\r\n" + "\r\n" + "1.Savings Account\r\n" + "\r\n" + "2.Current Account");
		ch = sc.nextInt();
		sc.nextLine();
		switch (ch) {
		case 1:
			String details1;
			System.out.println(
					"Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name)");
			details1 = sc.nextLine();
			String[] curr = details1.split(",");
			sa.setAccName(curr[0]);
			System.out.println("Account Name:" + sa.getAccName());
			sa.setAccNo(curr[1]);
			System.out.println("Account Number:" + sa.getAccNo());
			sa.setBankName(curr[2]);
			System.out.println("Bank Name:" + sa.getBankName());
			sa.setOrgName(curr[3]);
			System.out.println("Organization Name:" + sa.getOrgName());
			break;
		case 2:
			String details2;
			System.out.println(
					"Enter Account details in comma separated(Account Name,Account Number,Bank Name,TIN Number)");
			details2 = sc.nextLine();
			String[] sav = details2.split(",");
			ca.setAccName(sav[0]);
			System.out.println("Account Name:" + ca.getAccName());
			ca.setAccNo(sav[1]);
			System.out.println("Account Number:" + ca.getAccNo());
			ca.setBankName(sav[2]);
			System.out.println("Bank Name:" + ca.getBankName());
			ca.setTinNumber(sav[3]);
			System.out.println("Tin Number:" + ca.getTinNumber());
			break;

		}
	}
}
