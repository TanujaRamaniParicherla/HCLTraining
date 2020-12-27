package org.hcl.product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springbean-product.xml");
		Cashier cash=context.getBean(Cashier.class);
		ShoppingCart sc=context.getBean(ShoppingCart.class);
		cash.calculateTotalPrice(sc);
		
	}

}
