package com.EmployeeSallary;

public class Employee {
	
	public double calculateSalary(double basic) {
		
		double hra = (basic*20)/100;
		double da = (basic*10)/100;
		
		double salary = basic + hra + da;
		
		System.out.println("HRA: "+hra);
		System.out.println("DA: "+da);
		
		System.out.println("Total Basic salary: "+basic);
		System.out.println("Total Salary: "+salary);
		
		return salary;
		
	}

}
