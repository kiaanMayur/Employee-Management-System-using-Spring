package com.cg.controller;

import com.cg.employeedetails.Employee;
import com.cg.employeeservices.EmployeeServices;

public class EmployeeController {
	
	private EmployeeServices employeeServices;
	
	public void setEmployeeServices(EmployeeServices employeeServices) {
		this.employeeServices = employeeServices;
	}

	public void addEmployee(Employee employee) {
		employeeServices.addEmployee(employee);
	}
	
	public void viewEmployee() {
		employeeServices.viewEmployee();
	}
	
	public Employee getEmployeeById(int id) {
		return employeeServices.getEmployeeById(id);
	}
	
	public void delelteEmployee(int id) {
		employeeServices.deleteEmployee(id);
	}

}
