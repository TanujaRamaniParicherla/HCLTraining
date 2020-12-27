package org.hcl.service;

import java.util.List;

import org.hcl.dao.ProductDaoImpl;
import org.hcl.dao.ProductsDao;
import org.hcl.domain.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Service
public class ProductServiceImpl implements ProductService{
	private ProductDaoImpl dao;
	public ProductServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public ProductServiceImpl(ProductDaoImpl dao) {
		super();
		this.dao = dao;
	}
	

	public ProductDaoImpl getDao() {
		return dao;
	}

	public void setDao(ProductDaoImpl dao) {
		this.dao = dao;
	}

	@Override
	public List<Products> getProducts() {
		// TODO Auto-generated method stub
		return dao.getAll();
		
	}
	
}