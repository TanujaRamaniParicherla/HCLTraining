package org.java8.features;
import java.util.*;
public class FunctionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String,Integer> f=x->x.length();
		System.out.println(f.apply("tanuja"));
	}

}
