package org.reverse;

import java.util.*;
public class Test {
	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<String, String>(Collections.reverseOrder());
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of user details:");
		int n = sc.nextInt();
		sc.nextLine();
		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the details of" + (i + 1));
			String detail = sc.nextLine();
			str[i] = detail;
		}
		for (String a : str) {
			User u = new User();
			String b[] = a.split(",");
			u.setName(b[0]);
			u.setUsername(b[1]);
			u.setEmail(b[2]);
			u.setPassword(b[3]);
			map.put(b[0], b[1]);
		}
		 Set set = map.entrySet(); 
	        Iterator i = set.iterator(); 
	  
	        // Traverse map and print elements 
	        while (i.hasNext()) { 
	            Map.Entry me = (Map.Entry)i.next(); 
	            System.out.print(me.getKey() + ": "); 
	            System.out.println(me.getValue()); 
	        }
	}
}
