package org.eventexception;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	static long g;
	public static boolean valid(long id)
	{
		Scanner sc=new Scanner(System.in);
		EventType e=new EventType();
		do
		{
			try
			{
				if(id<=3)
				{
					g=id;
					return true;
				}
				else
				{
					throw new EventTypeDoesNotExistsException();
				}
			}
			catch(EventTypeDoesNotExistsException ie)
			{
				System.out.println(ie.getMessage());
				System.out.println("enter the correct id:");
				g=sc.nextLong();
				break;
			}
		}while(id>=3);
		return false;
	}
	public static void main(String[] args)
	{
		String s1;
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("How many number of user detail you want to enter: ");
		n=s.nextInt();
		s.nextLine();
		Event e=new Event();
		EventType it=new EventType();
		String str[]=new String[n];
		for (int i= 0; i < n; i++) {
			System.out.println("Enter detail of event"+(i+1));
			s1=s.nextLine();
			str[i]=s1;
		}
		//String s2=s1;
		System.out.println("Name\tDetails\tOwnername\tEventtypeid");
		for(String a:str) {
			String b[]=a.split(",");
			it.setName(b[0]);
			it.setDetail(b[1]);
			it.setOwnerName(b[2]);
			it.setId(Long.valueOf(b[3]));
			valid(it.getId());
			it.setId(g);
			System.out.println(it);
		}
		
		
	}

}


