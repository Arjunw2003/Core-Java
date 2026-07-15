package com.EmployeeSallary;

import java.util.Scanner;

public class TotalSalary {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Basic Sallary: ");
		double salary = sc.nextDouble();
		
		emp.calculateSalary(salary);
	
	}

}
