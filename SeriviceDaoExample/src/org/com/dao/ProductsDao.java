package org.com.dao;

import java.sql.SQLException;
import java.util.List;

import org.com.domain.Products;

public interface ProductsDao {
	public boolean insert(Products pr);
	public void update(String name,int id);
	public boolean delete(int n);
	List<Products> getProducts();
	

}
