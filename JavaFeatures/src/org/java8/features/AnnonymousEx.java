package org.java8.features;

public class AnnonymousEx {
	public static void main(String[] args)
	{
		interfc i=new interfc() {

			

			@Override
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
				
			}

			@Override
			public String greet(String message) {
				// TODO Auto-generated method stub
				return message;
			}
			
		};
		System.out.println(i.add(10, 20));
		System.out.println(i.greet("Hello Sweet Six"));
	}

}
