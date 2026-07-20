package com.practice;

public class Circle {

	int radius;
	public Circle(int radius) {
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}
	
	public void caculate() {
		
		double area = Math.PI * radius * radius;
		double circumference = 2 * Math.PI * radius;
		System.out.println("Area of Circle: "+area);
		System.out.println("Area of Circumference: "+circumference);
		
	}
}
