package org.hcl.service;

import java.util.List;

import org.hcl.dao.ProductDao;
import org.hcl.domain.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
	ProductDao dao;
	public ProductServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public ProductServiceImpl(ProductDao dao) {
		super();
		this.dao = dao;
	}

	public ProductDao getDao() {
		return dao;
	}

	public void setDao(ProductDao dao) {
		this.dao = dao;
	}

	@Override
	public List<Products> getProducts() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	

}
