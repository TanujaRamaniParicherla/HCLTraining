package org.com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.com.entities.Halls;
import org.com.entities.RegisterHall;
import org.com.service.RegisterService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class RegisterController {
	private RegisterService service;

	public RegisterController(RegisterService service) {
		super();
		this.service = service;
	}
	@PostMapping("/hallprocess")
	public String hallProcess(HttpServletRequest request)
	{
		String name = request.getParameter("name");
		int id = Integer.parseInt(request.getParameter("hallid"));
		String hallname=request.getParameter("hallname");
		RegisterHall r=new RegisterHall(name,id,hallname);
		service.insert(r);
		return "index";
	}
	@GetMapping("/registeredusers")
	public String getHall(Model model,HttpServletRequest request,HttpServletResponse response)
	{
		
		List<RegisterHall> halls=service.getHalls();
		model.addAttribute("hall", halls);
		return "registeredusers";
	}

}
