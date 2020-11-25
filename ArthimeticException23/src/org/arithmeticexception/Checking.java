package org.arithmeticexception;

public class Checking {
	int m,n;
	void calculate(int m,int n)
	{
		this.m=m;
		this.n=n;
		try
		{
			if(n==0)
			{
				System.out.println((m/n));
				
			}
			else
			{
				System.out.println("Cost per day of the item is:"+(m/n));
			}
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.toString());
		}
	}

}

