package org.sort.hall;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		ArrayList<Hall> hal=new ArrayList<Hall>();
		System.out.println("Enter the number of halls:");
		int n=sc.nextInt();
		sc.nextLine();
		String[] str=new String[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details of hall "+(i+1));
			String detail=sc.nextLine();
			str=detail.split(",");
			Hall hl=new Hall();
			hl.setName(str[0]);
			hl.setContactNumber(str[1]);
			hl.setCostPerDay(Double.valueOf(str[2]));
			hl.setOwnerName(str[3]);
			hal.add(hl);
		}
		Collections.sort(hal); 
		System.out.println("Sorted Order (from the least expensive to the most):"); 
		System.out.println("Name"+"\t"+"ContactNumber"+"\t"+"CostperDay"+"\t"+"Owner name");
	      for(Hall str1:hal){  
	    	  System.out.println(str1.name+" \t"+
	          str1.contactNumber+"\t\t "+str1.costPerDay+"\t\t "+str1.ownerName);  
	      } 
		
	}

}
