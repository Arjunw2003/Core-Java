package com.exam;

public class Student extends User {

	public Student(String stdName, int marks) {
		super(stdName, marks);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void StartExam() {
		System.out.println("Exam Started");

	}

	@Override
	public void endExam() {
		System.out.println("Exam End");

	}

	@Override
	public void calculateResult() {
		if (getMarks() >= 40) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

	}

}
