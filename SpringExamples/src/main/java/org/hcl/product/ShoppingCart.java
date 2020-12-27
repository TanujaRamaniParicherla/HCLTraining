package org.hcl.product;

import java.util.List;

public class ShoppingCart {
	private List<Product> products;
	public ShoppingCart() {
		// TODO Auto-generated constructor stub
	}
	public ShoppingCart( List<Product> products) {
		super();
		this.products = products;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	

}
