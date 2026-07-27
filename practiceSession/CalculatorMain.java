package com.practiceSession;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter Operator(+, -, *, /): ");
        char opr = sc.next().charAt(0);
        
        
        Calculator c = new Calculator(num1, num2);
        c.Calcuation(opr);
	}
}
