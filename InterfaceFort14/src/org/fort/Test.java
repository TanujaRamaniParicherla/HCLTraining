package org.fort;
import java.util.Scanner;
public class Test {
	

	public static void main(String[] args) {
		int ch;
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Fort f;
		System.out.println("What you want to visit\r\n"
				+ "\r\n"
				+ "Rajmachi\r\n"
				+ "\r\n"
				+ "Shivgadh\r\n"
				+ "\r\n"
				+ "Murud");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			f=new Rajmuchi();
			f.distance();
			break;
		case 2:
			f=new Shivgadh();
			f.distance();
			break;
		case 3:
			f=new Murud();
			f.distance();
			break;
		}
			
		}
		
		
		

	}



