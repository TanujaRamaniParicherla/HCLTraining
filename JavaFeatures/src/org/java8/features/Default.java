package org.java8.features;

import java.util.*;

public interface Default {
	default void getList(List<String> arr)
	{
		List li=new ArrayList<>();
		System.out.print("ArrayList: "+"\t");
	    for(String a : arr)
	    	System.out.println(a +"\t");
		
	}
}


