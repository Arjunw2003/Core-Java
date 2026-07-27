package com.practiceSession;

public class Calculator {

	int num1;
	int num2;

	public Calculator(int nm1, int num2) {

		this.num1 = nm1;
		this.num2 = num2;
	}

	public void Calcuation(char opr) {

		switch (opr) {
		case '+':
			System.out.println("Addition = " + (num1 + num2));
			break;

		case '-':
			System.out.println("Subtraction = " + (num1 - num2));
			break;

		case '*':
			System.out.println("Multiplication = " + (num1 * num2));
			break;

		case '/':
			System.out.println("Division = " + (num1 / num2));
			break;

		default:
			System.out.println("Invalid Operator");
			break;
		}
	}

}
