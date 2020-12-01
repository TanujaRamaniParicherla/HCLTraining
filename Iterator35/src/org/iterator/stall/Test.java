package org.iterator.stall;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList arr=new ArrayList();
		System.out.println("Enter the number of stall details:");
		int n=sc.nextInt();
		sc.nextLine();
		String str[]=new String[n];
		 //boolean result = false; 
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the stall "+(i+1)+" detail:");
			String detail=sc.nextLine();
			str[i]=detail;
		}
		for(String a:str)
		{
			Stall s=new Stall();
			String b[]=a.split(",");
			 if(b[0].startsWith("test"))
			{
			}
			 else
			 {
				 s.setName(b[0]);
					s.setDetail(b[1]);
					s.setOwnerName(b[3]);
					s.setType(b[2]);
					arr.add(s);	
			 }
		}
		System.out.println("Name"+"\t"+"Detail"+"\t"+"Type"+"\t"+"OwnerName");
		Iterator it = arr.iterator();
		 while(it.hasNext()) {
		    System.out.println(it.next());
		  }

		
	}

}
