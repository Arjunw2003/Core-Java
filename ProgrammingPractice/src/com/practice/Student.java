package com.practice;

public class Student {

	String name;
	int marks;

	public Student(String name, int marks) {

		this.name = name;
		this.marks = marks;

	}

	public int display() {
		System.out.println(name + " " + marks);

		if (marks >= 35) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		return marks;

	}

}
