package com.capgemini.controller;

public class Employee {

	private String employeeID;
	private String employeeName; 
	private int salary;
	private String department;
	public Employee(String employeeID, String employeeName, int salary, String department) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.salary = salary;
		this.department = department;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	

	
}
	
	