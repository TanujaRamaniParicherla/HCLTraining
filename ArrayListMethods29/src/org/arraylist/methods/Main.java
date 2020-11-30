package org.arraylist.methods;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		String search;
		ArrayList list=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of halls:");
		n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Hall Name "+(i+1));
			String name = sc.nextLine();
			list.add(name);
		}
		System.out.println("Enter the hall name to be searched:");
		search=sc.nextLine();
		if(list.contains(search))
		{
			System.out.println(search+" hall is found in the list at position"+list.indexOf(search));
		}
		else
		{
			System.out.println(search+" hall is not found");
		}
		
		

	}

}
