package org.class3;


public class Test {
	int code,stock;
	String name;
	double price;
	public static void main(String[] args)
	{
	//Scanner sc=new Scanner(System.in);
	Developer d1=new Developer();
	Developer d2=new Developer();
	Developer d3=new Developer();
	Developer d4=new Developer();
	Developer d5=new Developer();
	d1.product();
	d2.product();	
	d3.product();
	d4.product();
	d5.product();
	System.out.println("L & K Suppliers");
	System.out.println("Product Code:"+d1.getProduct_code());
	System.out.println("Product Name:"+d1.getProduct_name());
	System.out.println("Product Price:"+d1.getPrice());
	System.out.println("Product Stock:"+d1.getStock());
	System.out.println("Discounted Price:");
	d1.getDiscountedPrice(d1.getPrice());
	System.out.println("L & K Suppliers");
	System.out.println("Product Code:"+d2.getProduct_code());
	System.out.println("Product Name:"+d2.getProduct_name());
	System.out.println("Product Price:"+d2.getPrice());
	System.out.println("Product Stock:"+d2.getStock());
	System.out.println("Discounted Price:");
	d2.getDiscountedPrice(d2.getPrice());
	System.out.println("L & K Suppliers");
	System.out.println("Product Code:"+d3.getProduct_code());
	System.out.println("Product Name:"+d3.getProduct_name());
	System.out.println("Product Price:"+d3.getPrice());
	System.out.println("Product Stock:"+d3.getStock());
	System.out.println("Discounted Price:");
	d2.getDiscountedPrice(d3.getPrice());
	System.out.println("L & K Suppliers");
	System.out.println("Product Code:"+d4.getProduct_code());
	System.out.println("Product Name:"+d4.getProduct_name());
	System.out.println("Product Price:"+d4.getPrice());
	System.out.println("Product Stock:"+d4.getStock());
	System.out.println("Discounted Price:");
	d2.getDiscountedPrice(d4.getPrice());
	System.out.println("L & K Suppliers");
	System.out.println("Product Code:"+d5.getProduct_code());
	System.out.println("Product Name:"+d5.getProduct_name());
	System.out.println("Product Price:"+d5.getPrice());
	System.out.println("Product Stock:"+d5.getStock());
	System.out.println("Discounted Price:");
	d2.getDiscountedPrice(d5.getPrice());
	if((d1.getStock()<d2.getStock())&&(d1.getStock()<d3.getStock())&&(d1.getStock()<d4.getStock())&&(d1.getStock()<d5.getStock()))
	{
		System.out.println("The product With Min Stock :");
		System.out.println("L & K Suppliers");
		System.out.println(d1.getName());
		System.out.println(d1.getStock());
	}
	else if((d2.getStock()<d1.getStock())&&(d2.getStock()<d3.getStock())&&(d2.getStock()<d4.getStock())&&(d2.getStock()<d5.getStock()))
	{
		System.out.println("The product With Min Stock :");
		System.out.println("L & K Suppliers");
		System.out.println(d2.getName());
		System.out.println(d2.getStock());
	}
	else if((d2.getStock()<d1.getStock())&&(d2.getStock()<d3.getStock())&&(d2.getStock()<d4.getStock())&&(d2.getStock()<d5.getStock()))
	{
		System.out.println("The product With Min Stock :");
		System.out.println("L & K Suppliers");
		System.out.println(d3.getName());
		System.out.println(d3.getStock());
	}
	else if((d2.getStock()<d1.getStock())&&(d2.getStock()<d3.getStock())&&(d2.getStock()<d4.getStock())&&(d2.getStock()<d5.getStock()))
	{
		System.out.println("The product With Min Stock :");
		System.out.println("L & K Suppliers");
		System.out.println(d4.getName());
		System.out.println(d4.getStock());
	}
	else
	{
		System.out.println("The product With Min Stock :");
		System.out.println("L & K Suppliers");
		System.out.println(d5.getName());
		System.out.println(d5.getStock());
	}
	}
}
	

