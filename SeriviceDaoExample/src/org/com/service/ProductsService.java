package org.com.service;

import java.util.List;

import org.com.domain.Products;


public interface ProductsService {
	void addProducts();
	boolean deleteProducts();
	void updateProducts();
	List<Products> getProducts();
}
