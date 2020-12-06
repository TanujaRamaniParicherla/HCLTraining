package org.java8.features;
import java.util.*;

public class LambdaEx1 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Tanuja");
		arr.add("Kareema");
		arr.add("Pravallika");
		arr.add("Vallika");
		arr.add("Madhuna");
		arr.add("Divya");
		interfc i=(message)->
				{
					return message;
				};
				System.out.println(i.greet("SWEET SIX"));
		 Collections.sort(arr, (o1, o2) -> o1.compareTo(o2)); 
		 arr.forEach((e) -> {
		      System.out.print(e + "\n");
		    });
		 Runnable r = () -> {
			  for(int i2=0; i2<5; i2++) {
			  System.out.println("IDIOTS");
			 }
			 };
			 Thread t = new Thread(r);
			 t.start();
		
 
			
	}
}
