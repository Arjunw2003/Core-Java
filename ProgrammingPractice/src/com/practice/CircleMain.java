package com.practice;

import java.util.Scanner;

public class CircleMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Radius: ");
		int radius = sc.nextInt();
		
		Circle c = new Circle(radius);
		c.caculate();
	}

}
