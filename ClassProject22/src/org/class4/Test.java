package org.class4;

import java.util.Scanner;
public class Test {
	int code,stock;
	String name;
	double price;
	public static void main(String[] args)
	{
		int ch;
	Scanner sc=new Scanner(System.in);
	Developer d1=new Developer();
	Developer d2=new Developer();
	Developer d3=new Developer();
	System.out.println("Menu\r\n"+"1. Add Products\r\n"+"2. Display Products\r\n"+"3. Get Discounted Price\r\n"+"4. Find Costly Product\r\n"+"5. Check Min Stock\r\n"+"6. ExitEnter Choice");
	ch=sc.nextInt();
	switch(ch)
	{
	case 1:
		d1.product();
		d2.product();	
		d3.product();
		break;
	case 2:
		d1.product();
		d2.product();	
		d3.product();
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
	break;
	case 3:
		d1.product();
		d2.product();	
		d3.product();
		d1.getDiscountedPrice(d1.getPrice());
		d2.getDiscountedPrice(d2.getPrice());
		d2.getDiscountedPrice(d3.getPrice());
		break;
	case 4:
		d1.product();
		d2.product();	
		d3.product();
		if(d1.CheckPrice(d1.getPrice())<(d2.CheckPrice(d2.getPrice()))&&d1.CheckPrice(d1.getPrice())<(d3.CheckPrice(d3.getPrice())))
		{
			System.out.println(d1.product_name+" is cheapest product");
		}
		else if(d2.CheckPrice(d2.getPrice())<(d1.CheckPrice(d1.getPrice()))&&d2.CheckPrice(d2.getPrice())<(d3.CheckPrice(d3.getPrice())))
		{
			System.out.println(d2.product_name+" is cheapest product");
		}
		else
		{
			System.out.println(d3.product_name+" is cheapest product");
		}
		break;
	case 5:		
		d1.product();
		d2.product();	
		d3.product();
	if((d1.getStock()<d2.getStock())&&(d1.getStock()<d3.getStock()))
	{
		System.out.println("The product With Min Stock :");
		System.out.println("L & K Suppliers");
		System.out.println(d1.getName());
		System.out.println(d1.getStock());
	}
	else if((d2.getStock()<d1.getStock())&&(d2.getStock()<d3.getStock()))
	{
		System.out.println("The product With Min Stock :");
		System.out.println("L & K Suppliers");
		System.out.println(d2.getName());
		System.out.println(d2.getStock());
	}
	else
	{
		System.out.println("The product With Min Stock :");
		System.out.println("L & K Suppliers");
		System.out.println(d3.getName());
		System.out.println(d3.getStock());
	}
	break;
	case 6:
		System.out.println("Exit");
	}
}
}
	

