package org.hcl.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hcl.domain.Products;
import org.hcl.domain.User;
import org.hcl.service.ProductService;
import org.hcl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HelloController {
	private ProductService productservice;
	

	@Autowired
	public HelloController(ProductService productservice) {
		super();
		this.productservice = productservice;
	}

	@GetMapping("/")
	public String showHome()
	{
		return "home";
	}

	public ProductService getProductservice() {
		return productservice;
	}

	public void setProductservice(ProductService productservice) {
		this.productservice = productservice;
	}

	
	@GetMapping("/display")
	public ModelAndView display() {
		ModelAndView mv=new ModelAndView("display");
		List<Products> products = productservice.getProducts();
		System.out.println(products);
		mv.addObject("pro", products);
		return mv;
	}

}
