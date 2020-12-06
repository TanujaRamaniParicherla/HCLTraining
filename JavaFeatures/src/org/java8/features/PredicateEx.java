package org.java8.features;

public class PredicateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> p = s->(s.length()>3);
		System.out.println(p.test("tanuja"));
		System.out.println(p.test("tanu")); 

	}

}
