package com.practice;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter EmpName: ");
		String empName = sc.nextLine();
		
		System.out.print("Enter BasicSalary: ");
		double basicSalary = sc.nextDouble();
		Employee emp = new Employee(empName, basicSalary);
		emp.calculate();
	}
}
