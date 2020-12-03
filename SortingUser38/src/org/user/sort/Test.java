package org.user.sort;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of user details:");
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
			arr.add(u);		
		}
		System.out.println("Sort by\r\n"
				+ "\r\n"
				+ "1.Name\r\n"
				+ "\r\n"
				+ "2.Email");
		int ch=sc.nextInt();
		System.out.println("name"+"\t"+"Username"+"\t"+"email"+"\t"+"password");
		switch(ch)
		{
		case 1:
			NameComparator nm=new NameComparator();
			Collections.sort(arr,nm);
			//System.out.println("name"+"\t"+"Username"+"\t"+"email"+"\t"+"password");
			Iterator it = arr.iterator();
			 while(it.hasNext()) {
			    System.out.println(it.next());
			  }
			 break;
		case 2:
			//System.out.println("name"+"\t"+"Username"+"\t"+"email"+"\t"+"password");
			EmailComparator em=new EmailComparator();
			Collections.sort(arr,em);
			//System.out.println("name"+"\t"+"Username"+"\t"+"email"+"\t"+"password");
			Iterator it1 = arr.iterator();
			 while(it1.hasNext()) {
			    System.out.println(it1.next());
			  }
			 break;
		}
	}

}
