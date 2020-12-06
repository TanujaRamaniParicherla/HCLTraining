package org.java8.features;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExFormat {
		public static void main(String[] args) throws ParseException 
	    { 
	        Date d1 = new Date(); 
	        Date d2 = new Date(2010, 1, 3); 
	        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	        String strDate= formatter.format(d2);  
	        System.out.println(d1);
	        System.out.println("Current date is " + d1); 
	       System.out.println(d1.compareTo(d2));
	       System.out.println(d1.getDay());
	      d1.setHours(18);
	      System.out.println( d1.toLocaleString());
	      System.out.println( d1.toString());
	      Date date = formatter.parse("31/03/2015");  
	        System.out.println("Date is: "+date);  
	    } 
	} 


