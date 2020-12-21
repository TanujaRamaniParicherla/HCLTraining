package org.com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.com.domain.User;
import org.com.service.UserService;
import org.com.service.UserServiceImpl;

@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    UserService us=new UserServiceImpl();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		int userId=Integer.parseInt(request.getParameter("id"));
		String uname=request.getParameter("username");
		String pswd=request.getParameter("password");
		String phno=request.getParameter("phonenumber");
		String add=request.getParameter("address");
		User user=new User(userId,uname,pswd,phno,add);
		boolean b=us.insert(user);
		if(b)
		{
	
			pw.println("Register Successfull");
		}
		else
		{
			pw.println("Register UnSuccessfull");
		}
	}
	}


