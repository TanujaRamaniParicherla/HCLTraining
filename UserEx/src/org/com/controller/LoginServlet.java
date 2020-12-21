package org.com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.com.domain.User;
import org.com.service.UserService;
import org.com.service.UserServiceImpl;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 UserService us=new UserServiceImpl();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String uname=request.getParameter("username");
		String pswd=request.getParameter("password");
		User user=new User(uname,pswd);
		boolean b=us.validate(user);
		if(b)
		{
			
			 HttpSession session=request.getSession();
			Optional<User> user1=us.getUserByUserName(uname);
			session.setAttribute("user",user1.get());
			RequestDispatcher rd=request.getRequestDispatcher("dashboard.jsp");
			rd.forward(request, response);
			
		}
		else
		{
			response.sendRedirect("index.jsp");
		}
	}
	}


