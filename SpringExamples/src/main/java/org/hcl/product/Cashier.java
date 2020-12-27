package org.hcl.product;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class Cashier {
	private double totalPrice;
	private String fileName;
	private String filePath;
	private PrintWriter printWriter;

	public Cashier(String filePath, String fileName) {
		this.filePath = filePath;
		this.fileName = fileName;
		openStream();
	}

	public void openStream(){
	try{
	printWriter=new PrintWriter(filePath+fileName+".txt");
	}catch(FileNotFoundException fe){
	System.out.println("Exception Created while creating printwriter object"+fe.getMessage());
	}
	}

	public void calculateTotalPrice(ShoppingCart cart){
	List<Product> products=cart.getProducts();
	for(Product product:products){
	writeProductToFile(product);
	totalPrice=totalPrice+product.getPrice();
	}
	System.out.println(totalPrice);
	printWriter.println("==================================");
	printWriter.println("Total Price:"+totalPrice);
	printWriter.flush();
	}

	public void writeProductToFile(Product product){

	printWriter.println("ProductName:"+product.getName()+"\t"+"ProductPrice:"+product.getPrice());
	
}
}