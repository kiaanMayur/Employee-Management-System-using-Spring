package com.cg.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.cg.employeedetails.Employee;

public class EmployeeDAO{

	private List<Employee> employeeDetails = new ArrayList<>();
	private Map<Integer, Employee> employeeMappingById = new HashMap<>();
	private static int id;
	private int uniqueId;
	
	static{
		id = 100;
	}
	
	
	public void addEmployee(Employee employee) {
		employeeDetails.add(employee);
		uniqueId = ++id;
		employeeMappingById.put(uniqueId, employee);
		System.out.println("account created\nYour Employee id is " + uniqueId);
	}

	
	public void viewAllEmployee() {
		employeeDetails.stream().forEach(System.out :: println);
	}

	
	public Employee getEmployeeById(int id) {
		
		Set<Entry<Integer, Employee>> set = employeeMappingById.entrySet();
		for(Entry e : set) {
			Predicate<Employee> checyById = Employee -> e.getKey().equals(id);
			return (Employee) e.getValue();
			
		}
		return null;
	}

	
	public void deleteEmployee(int id) {
		Set<Entry<Integer, Employee>> set = employeeMappingById.entrySet();
		for(Entry e : set) {
			Predicate<Employee> checyById = Employee -> e.getKey().equals(id);
			employeeDetails.removeIf(checyById);
		}
		
		System.out.println("Account deleted");

	}
}
