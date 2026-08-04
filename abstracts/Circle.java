package com.abstracts;

public class Circle implements Shape {

	double radius;

	public Circle(double radius) {
		this.radius = radius;

	}

	@Override
	public void area() {
		double area = pi * radius * radius;
		System.out.println("Area Of Circle: "+area);
	}

	@Override
	public void perimeter() {

		double perimeter = 2 * pi * radius;
		System.out.println("Perimeter of Circle: "+perimeter);
	}

}
