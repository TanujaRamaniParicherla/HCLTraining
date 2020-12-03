package org.binary.serach;

import java.util.*;

import org.user.sort.EmailComparator;
import org.user.sort.User;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-gSrenerated method stub
		ArrayList<User> list=new ArrayList<User>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of user details");
		int n=sc.nextInt();
		sc.nextLine();
		String[] str=new String[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details of"+(i+1));
			String detail=sc.nextLine();
			str[i]=detail;
		}
		for(String a:str)
		{
			User u=new User();
			String b[]=a.split(",");
			u.setName(b[0]);
			u.setUsername(b[1]);
			u.setEmail(b[2]);
			u.setPassword(b[3]);
			list.add(u);	
		}
		System.out.println("Sort by\r\n"
				+ "\r\n"
				+ "1.Name\r\n"
				+ "\r\n"
				+ "2.Email");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			sc.nextLine();
			System.out.println("Enter name:");
			String val1=sc.nextLine();
			Collections.sort(list);
			for (User u: list)
			{
				if(u.getName().equalsIgnoreCase(val1))
				{
					u.display();
				}
			}
			 break;
		case 2:
			sc.nextLine();
			System.out.println("Enter email:");
			String val2=sc.nextLine();
			EmailComparator em=new EmailComparator();
			Collections.sort(list,em);
			for (User u1: list)
			{
				if(u1.getEmail().equalsIgnoreCase(val2))
				{
					u1.display();
				}
			}
			 break;
			
		}
		

	}
}

