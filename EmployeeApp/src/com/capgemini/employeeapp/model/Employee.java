package com.capgemini.employeeapp.model;

public class Employee {
	private int empId;
	private String empName;
	private double empsalary;
	private String empDept;
	public Employee(int empId, String empName, double empSalary2, String empDept2) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empsalary = empSalary2;
		this.empDept = empDept2;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(double empsalary) {
		this.empsalary = empsalary;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	
	

	
	
}
