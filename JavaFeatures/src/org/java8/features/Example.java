package org.java8.features;
import java.util.Calendar;
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c=Calendar.getInstance();
		System.out.println(c.getTime());
		Calendar c2 = Calendar.getInstance();;  
	      // compare the time values represented by two calendar objects.  
	       c2.add(Calendar.HOUR, 2);  
	       c2.add(Calendar.MINUTE, 10);  
	       c2.add(Calendar.SECOND, 45);  
	      int i = c.compareTo(c2);  
	      System.out.println(i);
	}

}
