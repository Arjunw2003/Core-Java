package com.polymorphism;

public class Calculater {

	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

//	=================================
	public void multiply(int a, int b) {
		System.out.println(a + b);
	}

	public void multiply(double a, double b) {
		System.out.println(a + b);
	}

//	====================================

	public void area(int radius) {
		double area = Math.PI * radius * radius;
		System.out.println("Area Of Circle: " + area);
	}

	public void area(int length, int width) {
		double area = length * width;
		System.out.println("Area Of Rectangle: " + area);
	}

//	====================================

	public int display(int num1) {
		return num1;
	}

	public String display(String name) {
		return name;
	}

//	==================================
	public void sum(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("Sum: " + sum);
	}

	public void sum(float num1, float num2) {
		float sum = num1 + num2;
		System.out.println("Sum: " + sum);
	}

//	=============================
	public void show(int age, String name) {
		System.out.println(age + " " + name);
	}

	public void show(String name, int age) {
		System.out.println(name + " " + age);
	}

}
