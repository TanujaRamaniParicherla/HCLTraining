package org.com.controller;

import java.util.List;

import javax.persistence.PostLoad;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.com.entities.Halls;
import org.com.entities.RegisterHall;
import org.com.service.HallsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HallContoller {
	private HallsService service;

	@Autowired
	public HallContoller(HallsService service) {
		super();
		this.service = service;
	}
	@GetMapping("/functionalhall")
	public String getHall(Model model,HttpServletRequest request,HttpServletResponse response,HttpSession session)
	{
		
		List<Halls> halls=service.getHalls();
		model.addAttribute("hall", halls);
		return "hall";
	}
	@GetMapping("/registerhall")
	public String registerhall()
	{
		return "registerhall";
	}
	@GetMapping("/delte")
	public String del()
	{
		return "delte";
	}
	@GetMapping("/delteprocees")
	public String delete(HttpServletRequest request)
	{
		int hallid=Integer.parseInt(request.getParameter("number"));
		service.delete(hallid);
		return "deletedisplay";
	}
	@GetMapping("/edit")
	public String edit()
	{
		return "edit";
	}
	@GetMapping("/editprocess")
	public String editContact(HttpServletRequest request,Model model) {
        int hallId = Integer.parseInt(request.getParameter("number"));
        Halls h = service.getHall(hallId);
       model.addAttribute("command", h);
        return "edit-form";
    }
	@RequestMapping(value = "/halledit", method = RequestMethod.POST)
    public ModelAndView saveEmployee(@ModelAttribute Halls h) {
        if (h.getId() == 0) { // if employee id is 0 then creating the
            // employee other updating the employee
        	service.insert(h);
        } else {
            service.update(h);
        }
        return new ModelAndView("redirect:/");
    }
	
}
	
	



