package org.com.service;

import java.util.List;

import org.com.domain.Product;

public interface ProductService {
	List<Product> getProducts();
	boolean addProduct(Product product);

}
