package org.class3;

import java.util.Scanner;


public class Developer {
	int product_code, stock;
	String product_name;
	double price, d1, d2,v1,v2,v3,v4,v5;
	static String name;
	Scanner sc = new Scanner(System.in);

	public void product() {
		System.out.println("Enter Product Code :");
		product_code = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Product Name :");
		product_name = sc.nextLine();
		System.out.println("Enter Price :");
		price = sc.nextDouble();
		System.out.println("Enter Stock :");
		stock = sc.nextInt();
	}

	public int getProduct_code() {
		return product_code;
	}

	public void setProduct_code(int product_code) {
		this.product_code = product_code;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Developer.name = name;
	}

	double CheckPrice(double d1) {
		this.d1 = d1;

		return 0;
	}

	void getDiscountedPrice(double d2) {
		this.d2 = d2;
		double val;
		if(d2<5000)
		{
			val=  (d2*5/100);
			System.out.println(val);
			//return val;
		}
		else if(d2>=50000)
		{
			val=  (d2*10/100);
			System.out.println(val);
		}
	}
		
		
		

	}

