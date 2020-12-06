package org.java8.features;

import java.util.*;

public class DefaultMethod implements Default {
	public static void main(String[] args)
	{
		List<String> l=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Strings you want to add:");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter elements to arraylist:");
		for(int i=0;i<n;i++)
		{
			String detail=sc.nextLine();
			l.add(detail);
		}
		Default p=new DefaultMethod();
		p.getList(l);
	}
}
