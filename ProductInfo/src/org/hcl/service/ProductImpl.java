package org.hcl.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hcl.dao.ProductsDao;
import org.hcl.dao.ProductsDaoImpl;
import org.hcl.domain.Products;

public class ProductImpl implements ProductsService {
	private ProductsDao pdao=new ProductsDaoImpl();
	public ProductImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public ProductImpl(ProductsDao pdao) {
		super();
		this.pdao = pdao;
	}

	ProductsDaoImpl pd=new ProductsDaoImpl();
	Scanner sc=new Scanner(System.in);
	List<Products> pr=new ArrayList<Products>();
	
	public List<Products> getProducts() {
		// TODO Auto-generated method stub
		return pdao.getProducts();
	}
}