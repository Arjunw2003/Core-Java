package com.abstracts;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee emp;
		emp = new FullTimeEmployee(40000);
		emp.calculateSalary();
		
		emp = new PartTimeEmployee(120);
		emp.calculateSalary();
	}
}
