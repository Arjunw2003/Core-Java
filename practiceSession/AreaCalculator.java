package com.practiceSession;

public class AreaCalculator {

	public void area(double radius) {
		double area = 3.14 * radius * radius;
		System.out.println("Area Of Circle: " + area);
	}

	public void area(int l, int b) {
		int area = l * b;
		System.out.println("Area Of Rectangle: " + area);
	}

	public void area(int base, int height, double t) {
		double area = 0.5 * base * height;
		System.out.println("Area Of Triangle: " + area);
	}
}
