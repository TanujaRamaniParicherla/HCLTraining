package org.com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.com.dao.ProductsDao;
import org.com.dao.ProductsDaoImpl;
import org.com.domain.Products;
import org.com.exception.ProductNotFound;



public class ProductImpl implements ProductsService {
	private ProductsDao pdao;
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
	@Override
	public void addProducts() {
		Products ps1=null;
		System.out.println("enter how many products you want to enter");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			ps1=new Products();
			System.out.println("Enter product id:");
			int id=sc.nextInt();
			ps1.setId(id);
			sc.nextLine();
			System.out.println("enter product name:");
			String name=sc.nextLine();
			ps1.setName(name);
			System.out.println("enter reason");
			String reason=sc.nextLine();
			ps1.setReason(reason);		
			pr.add(ps1);
		}
		pd.insert(ps1);
		
	}
	@Override
	public boolean deleteProducts() {
		Products ps1=null;
		System.out.println("Enter the product id you want to delete:");
		int n=sc.nextInt();
		pd.delete(n);
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void updateProducts() {
		Products ps1=null;
		System.out.println("enter the update name for the product id");
		String name=sc.nextLine();
		int id=sc.nextInt();
		pd.update(name, id);
		
	}
	@Override
	public List<Products> getProducts() {
		// TODO Auto-generated method stub
		return pdao.getProducts();
	}
}

/*	@Override
	public boolean deleteProducts(int id) throws ProductNotFound{
		
		// TODO Auto-generated method stub
		
		boolean b=false;
		Products product=getProduct(id);
		if(product!=null)
		b=pr.remove(product);
		else
		{
		throw new ProductNotFound("no customer existed with id");
		}
		return b;
	}

	@Override
	public List<Products> getProducts() {
		// TODO Auto-generated method stub
		
		return pr;
	}
	public Products getProduct(int id)
	{
		Products product=null;
		for(Products  pr1:pr)
		{
		if(id==pr1.getId())
		{
		product=pr1;
		break;
		}
		}
		return product;
		}
	

}*/

