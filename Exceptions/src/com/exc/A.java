package com.exc;

public class A {

	public static void main(String[] args) {

		System.out.println(30 / 2);
		System.out.println(12 / 6);
		System.out.println(2 / 2);
		try {
			System.out.println(4 / 0);
		} catch (ArithmeticException e) {
			System.out.println("/ by Zero are not possible by java");
			e.getMessage();
		}

		System.out.println(3 / 2);
		System.out.println(2 / 1);
	}
}
