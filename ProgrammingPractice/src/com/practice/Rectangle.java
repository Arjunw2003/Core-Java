package com.practice;

public class Rectangle {
	
	int length;
	int breadth;
	public Rectangle(int length, int breadth) {
		// TODO Auto-generated constructor stub
		this.length = length;
		this.breadth = breadth;
	}
	
	public void calculate() {
		
		int area = length*breadth;
		System.out.println("Rectangle of Area: "+area);
	}

}
