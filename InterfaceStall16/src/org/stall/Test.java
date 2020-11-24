package org.stall;


import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String stallName=null,ownerName = null;
		int cost=0,tvSet = 0,projector=0,screen=0;*/
		int ch;
		Stall s;
		Scanner sc=new Scanner(System.in);
		System.out.println("ChooseStall Type\r\n"
				+ "\r\n"
				+ "1)Gold Stall\r\n"
				+ "\r\n"
				+ "2)Premium Stall\r\n"
				+ "\r\n"
				+ "3)Executive Stall");
		ch=sc.nextInt();
		sc.nextLine();
		switch(ch)
		{
		case 1:
			String det;
			System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of TV sets)");
			det=sc.nextLine();
			String str[] = det.split(",");
			s=new GoldStall(str[0],str[1],Integer.valueOf(str[2]),Integer.valueOf(str[3]));
			s.display();
			break;
		case 2:
			String det1;
			System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Projectors)");
			det1=sc.nextLine();
			String str1[]=det1.split(",");
			s=new PremiumStall(str1[0],str1[1],Integer.valueOf(str1[2]),Integer.valueOf(str1[3]));
			s.display();
			break;
		case 3:
			String det2;
			System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Screens)");
			det2=sc.nextLine();
			String str2[]=det2.split(",");
			s=new ExecutiveStall(str2[0],str2[1],Integer.valueOf(str2[2]),Integer.valueOf(str2[3]));
			s.display();
			break;
			
			
		}

	}

}
