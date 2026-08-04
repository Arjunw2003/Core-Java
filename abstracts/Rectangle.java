package com.abstracts;

public class Rectangle implements Shape {

	int length;
	int breadth;

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void area() {
		double area = length * breadth;
		System.out.println("Area Of Rectangle: " + area);

	}

	@Override
	public void perimeter() {
		double perimeter = 2 * (length + breadth);
		System.out.println("Perimeter of Rectangle: " + perimeter);
	}

}
