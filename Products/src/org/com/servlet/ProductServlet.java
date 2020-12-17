package org.com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import org.com.domain.Products;
import org.com.service.ProductImpl;
import org.com.service.ProductsService;

/**
 * Servlet implementation class ProductServlet
 */

public class ProductServlet extends GenericServlet implements Servlet {
	private static final long serialVersionUID = 1L;
	ProductsService ps=new ProductImpl();
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public ProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		List<Products> products=ps.getProducts();
		pw.println("<table>");
		for(Products p:products) {
			pw.println("<tr>");
			pw.println("<td>"+p.getId()+"</td><td>"+p.getName()+"</td><td>"+p.getReason()+"</td>");
			pw.println("</tr>");
		}
		
		
		
	}

}
