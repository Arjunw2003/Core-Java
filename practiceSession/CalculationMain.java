package com.practiceSession;

import java.util.Scanner;

public class CalculationMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Units: ");
		int units = sc.nextInt();
		Electricity e = new Electricity();
		e.calculateElectricityBill(units);
	}
}
