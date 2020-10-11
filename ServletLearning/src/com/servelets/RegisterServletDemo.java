package com.servelets;

import java.io.IOException;
import java.io.PrintWriter;



import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class RegisterServletDemo extends HttpServlet{

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h2>Welcome to register</h2>");
		String name=req.getParameter("user_name");
		String pass=req.getParameter("user_password");
		String email=req.getParameter("user_email");
		String gender=req.getParameter("user_gender");
		String course=req.getParameter("user_course");
		
		String cond = req.getParameter("condition");
		
		if(cond.equals("checked")) {
			out.println("<h2> Name: "+ name + "</h2>");
			out.println("<h2> Password: "+ pass + "</h2>");
			out.println("<h2> Email: "+ email + "</h2>");
			out.println("<h2> Gender: "+ gender + "</h2>");
			out.println("<h2> Course: "+ course + "</h2>");
			
		}else {
			out.println("<h2>You have not accepted terms and condition");
		}
		
}
	
}
	

