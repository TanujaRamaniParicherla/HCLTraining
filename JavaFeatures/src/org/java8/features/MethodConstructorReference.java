package org.java8.features;

public class MethodConstructorReference {
	public String greet(String message)
	{
		return message;
	}
	public static void main(String[] args)
	{
		MethodConstructorReference mcr=new MethodConstructorReference();
		interface1 i=mcr::greet;
		System.out.println(i.greet("Method Reference"));
		interface2 i2=ConstructorReference::new;
		i2.get("Constructor Refernec");
	}
}
