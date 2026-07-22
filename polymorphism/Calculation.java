package com.polymorphism;

public class Calculation {

//	====================================

	public void calculate(int a) {
		int sq = a * a;
		System.out.println("Square: " + sq);
	}

	public void calculate(double a) {
		double cube = a * a * a;
		System.out.println("Cube: " + cube);
	}

//	=========================================
	public void max(int a, int b) {
		if (a > b) {
			System.out.println("Maximum No of a = " + a);
		} else {
			System.out.println("Maximum No of b = " + b);
		}
	}

	public void max(int a, int b, int c) {

		if (a >= b && a >= c) {
			System.out.println("Maximum No of a = " + a);
		} else if (b >= a && b >= c) {
			System.out.println("Maximum No of b = " + b);
		} else {
			System.out.println("Maximum No of c = " + c);
		}
	}
}
