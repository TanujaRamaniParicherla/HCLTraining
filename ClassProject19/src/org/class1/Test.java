package org.class1;

public class Test {
	public static void main(String[] args) {

		Developer d1 = new Developer();
		Developer d2 = new Developer();
		System.out.println("Product Details :");
		d1.setProduct_code(1);
		d1.setProduct_name("TV");
		d1.setPrice(50000.0);
		d1.setStock(10);
		d2.setProduct_code(2);
		d2.setProduct_name("Mobile");
		d2.setPrice(20000.0);
		d2.setStock(20);
		System.out.println("Product Code:" + d1.getProduct_code());
		System.out.println("Product Name:" + d1.getProduct_name());
		System.out.println("Product Price:" + d1.getPrice());
		System.out.println("Product Stock:" + d1.getStock());
		System.out.println("Product Code:" + d2.getProduct_code());
		System.out.println("Product Name:" + d2.getProduct_name());
		System.out.println("Product Price:" + d2.getPrice());
		System.out.println("Product Stock:" + d2.getStock());
		if (d1.CheckPrice(d1.getPrice()) < (d2.CheckPrice(d2.getPrice()))) {
			System.out.println(d1.product_name + " is cheaper than " + d2.product_name);
		} else {
			System.out.println(d2.product_name + " is cheaper than" + d1.product_name);
		}

	}

}
