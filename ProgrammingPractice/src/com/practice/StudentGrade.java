package com.practice;

public class StudentGrade {

	int marks;

	public StudentGrade(int marks) {
		// TODO Auto-generated constructor stub
		this.marks = marks;
	}

	public String grade() {

		if (marks >= 90) {
			return "A";
		} else if (marks >= 75) {
			return "B";
		} else if (marks >= 40) {
			return "C";
		} else {
			return "Fail";
		}
	}

}
