package com.servelets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletGenericsDemo extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("servicing");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1>this is my output from Generic servlet method: and time is "+new Date().toString()+"</h1>");
		
		
	}

}
