package com.practice;

public class MaxNumber {

	int num1;
	int num2;
	int num3;

	public MaxNumber(int num1, int num2, int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}

	public void findMax() {

		if (num1 >= num2 && num2 >= num3) {
			System.out.println("Max No is = " + num1);
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("Max No is = " + num2);
		} else {
			System.out.println("Max No is = " + num3);
		}
	}

}
