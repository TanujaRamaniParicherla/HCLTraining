package org.com.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.com.service.UserService;
import org.com.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class SampleController {
	private UserService service;
	@Autowired
	public SampleController(UserService service) {
		super();
		this.service = service;
	}
	@RequestMapping(value = {"/","/index"}, method = RequestMethod.GET)
	public String showIndex()
	{
		return "index";
	}
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String showHome()
	{
		return "home";
	}
	@GetMapping("/help")
	public String help()
	{
		return "help";
	}
	@RequestMapping(value = "/loginsigup", method = RequestMethod.GET)
	public String LoginSignup()
	{
		return "loginsigup";
	}
	@RequestMapping(value = "/Register", method = RequestMethod.GET)
	public String Signup()
	{
		
		return "Register";
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String Login()
	{
		return "login";
	}
	@PostMapping("/registerprocess")
	public String registerProcess( HttpServletRequest request,HttpSession session) {
		
		
		int id = Integer.parseInt(request.getParameter("id1"));
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String designation=request.getParameter("designation");
		String address = request.getParameter("address");
		User u=new User(id,name,password,email,designation,address);
		service.insert(u);
		session.setAttribute("userdesi",designation);
		return "index";
	}
	@PostMapping("/loginprocess")
	public String loginProcess(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws ServletException, IOException
	{
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		User u=new User(name,password);
		boolean b=service.validate(u);
		String url=null;
		if(b)
		{
			User user1=service.getName(name);
			session.setAttribute("user", user1.getClass());
			 session.setAttribute("username",user1.getUsername());
			 session.setAttribute("userdesi", user1.getDesignation());
			 url="redirect:/dashboard";
		}
		else
		{
			url="redirect:/index";
		}
		return url;
	}
	@GetMapping("/dashboard")
	public String dashboard()
	{
		return "dashboard";
	}
	@GetMapping("/logout")
	public String logout(HttpServletRequest request, HttpServletResponse response)
	{
			HttpSession session=request.getSession(false);
			if(session!=null)
			{
				session.setAttribute("user", null);
				session.invalidate();
			}
			return "logout";
		}
	}
	

	
	


