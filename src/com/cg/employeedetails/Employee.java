package com.cg.employeedetails;

public class Employee {
	
	private String employeeName;
	private int salary;
	private String designation;
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	@Override
	public String toString() {
		return "Employee Detail:\n--------------------------------------------------\nEmployee Name: " + employeeName + "\nsalary: " + salary + "\ndesignation: " + designation;
	}
	

}
