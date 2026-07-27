package com.practiceSession;

public class MenuDriven {

	int num;

	public MenuDriven(int num) {
		this.num = num;
	}

	public void Menu(int choice) {

		switch (choice) {

		case 1:
			if (num % 2 == 0) {
				System.out.println(num + " is Even");
			} else {
				System.out.println(num + " is Odd");
			}
			break;

		case 2:
			int count = 0;

			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}

			if (count == 2) {
				System.out.println(num + " is Prime");
			} else {
				System.out.println(num + " is Not Prime");
			}
			break;

		case 3:
			int reverse = 0;

			while (num > 0) {
				int rem = num % 10;
				reverse = reverse * 10 + rem;
				num = num / 10;
			}

			System.out.println("Reverse Number = " + reverse);
			break;

		default:
			System.out.println("Invalid Choice");
		}
	}
}
