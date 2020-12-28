package org.hcl.controllers;

import java.util.List;

import org.hcl.domain.Products;
import org.hcl.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 

@Controller
public class HelloController {
	private ProductService productservice;
	@Autowired
	public HelloController(ProductService productservice) {
		super();
		this.productservice = productservice;
	}
	
	public ProductService getProductservice() {
		return productservice;
	}

	public void setProductservice(ProductService productservice) {
		this.productservice = productservice;
	}

	@RequestMapping({"/","home"})
	public String showHome()
	{
		return "home";
	}
	@RequestMapping(value="/display",method=RequestMethod.GET)
	public String display(Model model)
	{
		List<Products> products=productservice.getProducts();
		System.out.println(products);
		model.addAttribute("pro", products);
		return "home";
	}
}
