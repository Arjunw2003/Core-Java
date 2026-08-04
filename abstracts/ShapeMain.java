package com.abstracts;

import java.util.Scanner;

public class ShapeMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Radius: ");
		int radius = sc.nextInt();

		System.out.print("Enter Length: ");
		int length = sc.nextInt();

		System.out.print("Enter breadth: ");
		int breadth = sc.nextInt();

		Shape s;

		s = new Circle(radius);
		s.area();
		s.perimeter();

		s = new Rectangle(length, breadth);
		s.area();
		s.perimeter();

	}
}
