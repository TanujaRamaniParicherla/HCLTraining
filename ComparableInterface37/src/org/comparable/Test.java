package org.comparable;
import java.util.*;
public class Test {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//Address ad=new Address();
		ArrayList list=new ArrayList();
		System.out.println("Enter the number of users:");
		int n=sc.nextInt();
		sc.nextLine();
		String[] str=new String[n];
		System.out.println("Enter user address in CSV(Username,AddressLine 1,AddressLine 2,PinCode):");
		for(int i=0;i<n;i++)
		{
			String detail=sc.nextLine();
			str[i]=detail;
		}
		for(String a:str)
		{
			Address ad=new Address();
			String b[]=a.split(",");
			ad.setUsername(b[0]);
			ad.setAddressLine1(b[1]);
			ad.setAddressLine2(b[2]);
			ad.setPincode(Integer.valueOf(b[3]));
			list.add(ad);
		}
		System.out.println("UserDetails");
		Collections.sort(list);
		Iterator it = list.iterator();
		 while(it.hasNext()) {
		    System.out.println(it.next());
		  }
	}

}
