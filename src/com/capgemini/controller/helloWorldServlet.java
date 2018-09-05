package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/hello")
public class helloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public helloWorldServlet() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("Inside default constructor");
    }

	@Override
	public void init(ServletConfig  config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Init() method is called");
	
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet() method is called.");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>HELLO WORLD</h1>");
		out.close();
	}

	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy() method is called.");
		
	}

}
