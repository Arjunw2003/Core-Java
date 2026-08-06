package com.exam;

public abstract class User implements Exam{

	private String stdName;
	private int marks;

	public User(String stdName, int marks) {
		this.stdName = stdName;
		this.marks = marks;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public void studentDetails() {
		System.out.println("Student Name: " + stdName);
		System.out.println("Student Marks: " + marks);
	}

	public abstract void calculateResult();

}
