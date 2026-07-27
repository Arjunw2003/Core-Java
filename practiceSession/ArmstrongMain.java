package com.practiceSession;

import java.util.Scanner;

public class ArmstrongMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int num = sc.nextInt();
		Armstrong arm = new Armstrong();
		System.out.println(arm.isArmstrong(num));
	}
}
