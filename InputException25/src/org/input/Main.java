package org.input;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		
		try
		{
			System.out.println("Enter an integer input:");
			n=sc.nextInt();	
			System.out.println("Entered value is"+n);
		}
		catch(InputMismatchException e)
		{
			System.out.print(e.toString());
	}

}
}
