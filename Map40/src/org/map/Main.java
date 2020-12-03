package org.map;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map<String,Map<String,List<Address>>> map=new LinkedHashMap<String,Map<String, List<Address>>>();
		 ArrayList<Address> list=new ArrayList<Address>();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number of address");
		 int n=sc.nextInt();
		 sc.nextLine();
		 String[] str=new String[n];
		 for(int i=0;i<n;i++)
		 {
			 System.out.println("Enter the address detail"+(i+1));
			 String detail=sc.nextLine();
			 str[i]=detail;
		 }
		 for(String a:str)
		 {
			 Address ad=new Address();
			 String[] b=a.split(",");
			 ad.setAddressLine1(b[0]);
			 ad.setAddressLine2(b[1]);
			 ad.setCity(b[2]);
			 ad.setState(b[3]);
			 ad.setPincode(Integer.valueOf(b[4]));
			 list.add(ad);
			 //map.put(ad.getState(), Map<ad.getCity(),list);
		 }
		// System.out.println(list);
		 System.out.println("Enter state to be serached");
		 String state=sc.nextLine();
		 System.out.println("Enter city to be searched");
		 String city=sc.nextLine();
		//sdfsaedf Collections.sort((list);
		 for(Address ad:list)
		 {
			 if(ad.getState().equalsIgnoreCase(state)&&ad.getCity().equalsIgnoreCase(city))
			 {
				 System.out.println(ad);
			 }
		 }
		 
	}
}

