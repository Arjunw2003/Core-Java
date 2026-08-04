package com.abstracts;

public class SimpleCalculator implements Calculator {

	@Override
	public void add(int a, int b) {
		System.out.println("Addition = " + (a + b));

	}

	@Override
	public void subtract(int a, int b) {
		System.out.println("Subtract = " + (a - b));

	}

	@Override
	public void multiply(int a, int b) {
		System.out.println("Multiply = " + (a * b));

	}

	@Override
	public void divide(int a, int b) {
		System.out.println("Divide = " + (a / b));

	}

}
