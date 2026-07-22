package com.polymorphism;

public class Details {

	String name;
	int age;

	public Details(String name) {
		this.name = name;
	}

	public Details(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Name: " + name + " " + "Age: " + age);
	}

}
