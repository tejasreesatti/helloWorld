package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeDetails")
public class EmployeeDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String employeeId;
	private ArrayList<Employee> al = new ArrayList<Employee>();

//	public EmployeeDetails(String employeeId, ArrayList<Employee> al) {
//		super();
//		this.employeeId = employeeId;
//		
//		this.al = al;
//	}

	@Override
	public void init() throws ServletException {

		Employee e1 = new Employee("100","Teja",500000, "ECE");
		Employee e2 = new Employee("101","Swapni",500000, "ECE");
		Employee e3 = new Employee("102","Prasanna", 500000, "CSE");
		Employee e4 = new Employee("103","Harshi", 500000, "Civil");
		Employee e5 = new Employee("104","anantha",500000, "CSE");

		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);

		super.init();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		String id = request.getParameter("username");
		
		int i = 0;

		for (Employee e : al) {
		
			if (e.getEmployeeID().equals(id)) {
				i = 1;
		
				out.println("<table border = 1>"
						 + "<tr>"+ "<th>Employee Details </th>"
						 		+ "</tr>"
						 		+ "<tr>"
								+ "<td>" + e.getEmployeeID() + "</td>"
										+ "<td>" + e.getEmployeeName()+"</td>"
										+ "<td>" + e.getSalary()
						+ "</td>" + "<td>" + e.getDepartment() + "</td>"
								+ "</tr>" + "</table>");
				break;

			}
		}
		 if(i==0) {
			 out.println("User Details does not exist");
		 }

//		doGet(request, response);
	}

}
