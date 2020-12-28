package org.hcl.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hcl.domain.Products;
import org.hcl.domain.User;
import org.hcl.service.ProductService;
import org.hcl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	private ProductService productservice;
	private UserService userservice;

	@Autowired
	public HelloController(ProductService productservice) {
		super();
		this.productservice = productservice;
	}

	@Autowired
	public HelloController(UserService userservice) {
		super();
		this.userservice = userservice;
	}

	public ProductService getProductservice() {
		return productservice;
	}

	public void setProductservice(ProductService productservice) {
		this.productservice = productservice;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showHome() {
		return "home";
	}
	
	@GetMapping("/register")
	public String register() {
		return "registration";
	}
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@PostMapping("/registerprocess")
	public String registerProcess(HttpServletRequest request) {

		int id = Integer.parseInt(request.getParameter("id1"));
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		String phonenumber = request.getParameter("phonenumber");
		String address = request.getParameter("address");
		User u = new User(id, name, password, phonenumber, address);
		boolean b = userservice.insert(u);
		if (b) {
			System.out.println("inserted successfully");
		}
		return "home";

	}

	@PostMapping("/loginprocess")
	public String login(HttpServletRequest request) {

		String name = request.getParameter("username");
		String password = request.getParameter("password");

		User u = new User(name, password);
		boolean b = userservice.validate(u);
		if (b) {
			System.out.println("login successfully");
		}
		return "home";

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
