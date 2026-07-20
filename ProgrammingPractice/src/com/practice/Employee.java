package com.practice;

public class Employee {
	
	String empName;
	double basicSalary;
	
	public Employee(String empName, double basicSalary) {
		// TODO Auto-generated constructor stub
		this.empName = empName;
		this.basicSalary = basicSalary;
	}
	
	public void calculate() {
		
		double bonus = (basicSalary*20)/100;
		double totalSalary = basicSalary+bonus;
		System.out.println("Bonus: "+bonus);
		System.out.println("Total Salary: "+totalSalary);
	}
	

}
