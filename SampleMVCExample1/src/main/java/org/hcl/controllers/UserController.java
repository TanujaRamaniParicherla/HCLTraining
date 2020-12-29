package org.hcl.controllers;

import javax.servlet.http.HttpServletRequest;

import org.hcl.domain.User;
import org.hcl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class UserController {
	private UserService userservice;
	@Autowired
	public UserController(UserService userservice) {
		super();
		this.userservice = userservice;
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
		String name = request.getParameter("name");
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

}
