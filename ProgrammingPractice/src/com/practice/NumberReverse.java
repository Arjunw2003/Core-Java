package com.practice;

public class NumberReverse {

	int number;

	public NumberReverse(int number) {
		// TODO Auto-generated constructor stub
		this.number = number;
	}

	public void reverse() {

		int rev = 0;
		while (number != 0) {

			int rem = number % 10;
			rev = rev * 10 + rem;
			number = number / 10;

		}
		System.out.println("Reverse Number: " + rev);

	}
}
