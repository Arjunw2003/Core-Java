
package com.practiceSession;

public class Manager extends Employee {

	double bonus;

	public Manager(String name, double salary, double bonus) {
		super(name, salary);
		this.bonus = bonus;
	}

	public void calculateTotalSalary() {

		double totalSalary = salary + bonus;

		System.out.println("Name = " + name);
		System.out.println("Salary = " + salary);
		System.out.println("Bonus = " + bonus);
		System.out.println("Total Salary = " + totalSalary);
	}

	public static void main(String[] args) {

		Manager m = new Manager("Arjun", 50000, 10000);

		m.calculateTotalSalary();
	}
}
