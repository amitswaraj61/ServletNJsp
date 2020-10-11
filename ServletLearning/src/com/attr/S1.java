package com.attr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class S1 extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	
		    String n1=request.getParameter("n1");
			String n2=request.getParameter("n2");
			
			int nn1=Integer.parseInt(n1);
			int nn2=Integer.parseInt(n2);
			
			//add
			int s=nn1+nn2;
			
			//attribute
			request.setAttribute("sum", s);
			
		    //request ...request dispatcher
			
			RequestDispatcher rd = request.getRequestDispatcher("s2");
			rd.forward(request, response);
			
			
		}
}