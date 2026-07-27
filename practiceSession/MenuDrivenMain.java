package com.practiceSession;

import java.util.Scanner;

public class MenuDrivenMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("===== MENU =====");
		System.out.println("1. Check Even/Odd");
		System.out.println("2. Check Prime");
		System.out.println("3. Reverse Number");
		System.out.print("Enter Your Choice: ");
		int choice = sc.nextInt();

		System.out.print("Enter Number: ");
		int num = sc.nextInt();

		MenuDriven m = new MenuDriven(num);
		m.Menu(choice);
	}

}
