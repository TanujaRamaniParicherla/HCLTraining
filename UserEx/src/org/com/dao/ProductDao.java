package org.com.dao;

import java.util.List;

import org.com.domain.Product;

public interface ProductDao {
	List<Product> getAll();
	boolean add(Product product);
	

}
