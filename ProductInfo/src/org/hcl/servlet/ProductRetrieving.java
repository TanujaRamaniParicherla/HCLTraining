package org.hcl.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hcl.domain.Products;
import org.hcl.service.ProductImpl;
import org.hcl.service.ProductsService;

public class ProductRetrieving extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductsService ps=new ProductImpl(); 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		List<Products> products=ps.getProducts();
		request.setAttribute("Products", products);
		RequestDispatcher rd=request.getRequestDispatcher("Retrieve.jsp");
		rd.forward(request,response);
		pw.close();
	}

	

}
