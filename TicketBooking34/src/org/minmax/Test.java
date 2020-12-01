package org.minmax;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList arr = new LinkedList();
		String detail;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of customers:");
		int n = sc.nextInt();
		String str[] = new String[n];
		sc.nextLine();
		if (n <= 0) {
			System.out.println("Invalid Input");
		} else {
			System.out.println("Enter the booking price accordingly with customer name in CSV(Customer Name,Price)");
			for (int i = 0; i < n; i++) {
				detail = sc.nextLine();
				str[i] = detail;
			}
			for (String a : str) {
				TicketBooking tb = new TicketBooking();
				String b[] = a.split(",");
				tb.setCustomerName(b[0]);
				tb.setPrice(Integer.valueOf(b[1]));
				arr.add(tb);

			}
			Collections.sort(arr);  
			System.out.println("Minimum Cost:"+arr.getFirst());
			System.out.println("Maximum Cost:"+arr.getLast());

		}

	}
}
