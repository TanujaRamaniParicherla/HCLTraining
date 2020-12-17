package org.com.hcl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.*;
import org.com.dao.ProductsDao;
import org.com.dao.ProductsDaoImpl;
import org.com.domain.Products;
import org.com.service.ProductImpl;
import org.com.service.ProductsService;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		ProductsDao pdao=new ProductsDaoImpl();
		ProductImpl ps=new ProductImpl(pdao);
		//Products p=new Products();
		ProductsDaoImpl pi=new ProductsDaoImpl();
		System.out.println("What do you want to select:");
		int n=sc.nextInt();
		switch(n)
		{
		case 1:	ps.addProducts();
		break;
		case 2:ps.deleteProducts();
		break;
		case 3:ps.updateProducts();
		break;
		case 4:
			List<Products> arr=ps.getProducts();
			arr.stream().forEach( pro -> {
			System.out.println(pro.getId()+pro.getName()+pro.getReason());
		});
	
		}	
		
		
		
		
	
		
		}
	}


