package com.abstracts;

public class FullTimeEmployee implements Employee {

	double monthlySalary;

	public FullTimeEmployee(double monthlySalary) {

		this.monthlySalary = monthlySalary;
	}

	@Override
	public void calculateSalary() {
		System.out.println("Full Time Employee Salary: " + monthlySalary);
	}

}
