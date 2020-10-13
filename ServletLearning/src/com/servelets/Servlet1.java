package com.servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name=request.getParameter("user_name");
		out.println("<h1>Your name is : "+name+" <h1>");
		out.println(""
				+ "<form action='servlet2'>"
				+ "<input type='hidden' name='user_name' value='"+name+"'/>"
				+ "<button>Go to 2nd servlet</button>"
				+ ""
				+ ""
				+ "</form>");
				
				
	}
}
