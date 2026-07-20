package com.practice;

public class PrimeNumberCheck {

	int number;

	public PrimeNumberCheck(int number) {
		// TODO Auto-generated constructor stub

		this.number = number;
	}

	public void cheakPrime() {

		int count = 0;

		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}

		if (count == 2) {
			System.out.println(number + " is Prime Number");
		} else {
			System.out.println(number + " is Not Prime Number");
		}

	}
}
