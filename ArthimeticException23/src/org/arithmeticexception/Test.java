package org.arithmeticexception;
import java.util.Scanner;
public class Test {
	int m,n;
	public static void main(String[] args)
	{
		int m,n;
		Checking c=new Checking();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the cost of the item for n days");
		m=sc.nextInt();
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		c.calculate(m, n);
	
	
	}		

}
