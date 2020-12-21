package org.com.service;

import java.util.List;

import org.com.dao.ProductDao;
import org.com.dao.ProductDaoImpl;
import org.com.domain.Product;

public class ProductServiceImpl implements ProductService {
	ProductDao dao=new ProductDaoImpl();
	@Override
	public List<Product> getProducts() {
		System.out.println(dao.getAll());
	return 	dao.getAll();
	}

	@Override
	public boolean addProduct(Product product) {
		return dao.add(product);
	}

}
