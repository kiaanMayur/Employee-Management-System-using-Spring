package com.cg.employeeui;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.controller.EmployeeController;
import com.cg.employeedetails.Employee;

public class EmployeeUI {
	
	private int answer, check;
	Scanner scanner = new Scanner(System.in);
	private EmployeeController employeeController;
	Employee employee;
	
	public void setEmployeeController(EmployeeController employeeController) {
		this.employeeController = employeeController;
	}



	public void dataInformation() {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		employeeController = (EmployeeController) context.getBean("EmpController");

		do {
				System.out.println("Enter your choice:\n\n"
					+ "1.Creater account\n"
					+ "2.View Account\n"
					+ "3.Get Account details by Id\n"
					+ "4.Delete Account of Employee\n"
					+ "5.Exit\n"
					+ "-------------------------------------------------------------------------------------------------");
			int choice = scanner.nextInt();
			
			switch(choice) {
			
			case 1:do {
				
				employee = new Employee();
				System.out.println("CREATE ACCOUNT:\nEnter the details below:\n");
				System.out.println("Name: ");
				String name = scanner.next();
				employee.setEmployeeName(name);
				System.out.println("\nEnter the salary: ");
				int salary = scanner.nextInt();
				employee.setSalary(salary);
				System.out.println("\nEnter the designation: ");
				String designation = scanner.next();
				employee.setDesignation(designation);
				
				employeeController.addEmployee(employee);
				
				System.out.println("\nWant to enter more: ");
				answer = scanner.nextInt();
			}while(answer > 0);
				
				break;
				
			case 2:
				System.out.println("VIEW ALL ACCOUNTS: ");
				employeeController.viewEmployee();
				break;
				
			case 3:
				System.out.println("ACCOUNT DETAILS BY ID:\nEnter the id of the employee: ");
				int id = scanner.nextInt();
				System.out.println(employeeController.getEmployeeById(id));
				break;
				
			case 4:
				System.out.println("Deleting account:"
						+ "\nenter the id of the employee: ");
				int empId = scanner.nextInt();
				employeeController.delelteEmployee(empId);
				break;

			case 5:
				System.out.println("Thank You");
				System.exit(0);
				
			default:
				System.out.println("Invalid choice:");
			}
			
			System.out.println("\nWant to do something else: ");
			check = scanner.nextInt();
			
		}while(check > 0);
		
	}
}
