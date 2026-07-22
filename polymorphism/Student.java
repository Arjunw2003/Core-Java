package com.polymorphism;

public class Student {

	int id;
	String name;

	public Student() {

	}

	public Student(int id) {
		this.id = id;
	}

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void display() {
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println();

	}

}
