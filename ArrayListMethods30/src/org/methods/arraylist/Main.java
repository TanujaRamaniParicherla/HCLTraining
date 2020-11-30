package org.methods.arraylist;
import java.util.*;

public class Main {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		  ArrayList arrli = new ArrayList();
		  System.out.println("Enter number of user to be Added:");
		  int n=sc.nextInt();
		  sc.nextLine();
		  String[] str=new String[n];
		  User u=new User();
		  for(int i=0;i<n;i++)
		  {
			  System.out.println("Enter the of User details "+(i+1));
			  String str1=sc.nextLine();
			  str[i]=str1;
			  arrli.add(str1); 
		  }
		  System.out.println("Name\tDetails\tOwnername\tEventtypeid");
			for(String a:str) {
				String b[]=a.split(",");
				u.setName(b[0]);
				u.setContactNumber(b[1]);
				u.setUserName(b[2]);
				u.setEmail(b[3]);
				u.display(b[0],b[1],b[2],b[3]);
			}
			System.out.println("Enter range:");
			System.out.println("Enter starting range");
			int strRan=sc.nextInt();
			System.out.println("Enter Ending range:");
			int endRan=sc.nextInt();
			for(int j=strRan;j<endRan;j++)
			{
				arrli.remove(j);
			}
			System.out.println(arrli);

	}
}
