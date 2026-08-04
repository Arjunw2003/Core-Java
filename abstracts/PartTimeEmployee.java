package com.abstracts;

public class PartTimeEmployee implements Employee {

	int hours;

	public PartTimeEmployee(int hours) {
		this.hours = hours;
	}

	@Override
	public void calculateSalary() {
		double salary = hours * ratePerHoure;
		System.out.println("Part Time Employee Salary: " + salary);

	}

}
