package com.servelets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet {
	
	ServletConfig conf;

	@Override
	public void destroy() {
		System.out.println("going to distroy servlet object");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		
		return this.conf;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "this servlet created by Amit";
	}

	@Override
	public void init(ServletConfig conf) throws ServletException {
		this.conf=conf;
		System.out.println("creating object");
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("servicing");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1>this is my output from servlet method: and time is "+new Date().toString()+"</h1>");
		
	}

}
