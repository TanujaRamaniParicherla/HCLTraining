package org.market;

import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time;
		long principal;
		MutalFund f;
		MutalFund f1;
		MutalFund f2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount you want to invest");
		principal=sc.nextLong();
		System.out.println("Enter the tenure of the SIP");
		time=sc.nextInt();
		f=new AxisBank(time,principal);
		f.duration();
		f1=new HDFC(time,principal);
		f1.duration();
		f2=new ICICI(time,principal);
		f2.duration();
		if((f.amount()>f1.amount())&&(f.amount()>f2.amount()))
		{
			System.out.println("AxisBank-\r\n"
					+ "\r\n"
					+ "You will have returns as"+f.amount()+"in "+time+"years");
		}
		else if((f1.amount()>f.amount())&&(f1.amount()>f2.amount()))
		{
			System.out.println("HDFCBank-\r\n"
					+ "\r\n"
					+ "You will have returns as"+f1.amount()+"in "+time+"years");
		}
		else
		{
			System.out.println("ICICBank-\r\n"
					+ "\r\n"
					+ "You will have returns as"+f2.amount()+"in "+time+"years");
		}
		
			
		
	}
		
		
		

	}


