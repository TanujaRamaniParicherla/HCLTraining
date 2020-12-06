package org.java8.features;
import java.util.*;
import java.util.stream.Collectors;
public class CollectionStream {
	public static void main(String[] args)
	{
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(16);
		arr.add(50);
		List<Integer> l1=arr.stream().filter(i -> i % 4 == 0).collect(Collectors.toList());
	   System.out.println(l1);
	}
}
