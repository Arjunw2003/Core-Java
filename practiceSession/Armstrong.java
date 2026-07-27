package com.practiceSession;

public class Armstrong {

	public boolean isArmstrong(int num) {

		int temp = num;
		int sum = 0;

		while (temp > 0) {
			int rem = temp % 10;
			sum = sum + (rem * rem * rem);
			temp = temp / 10;
			
		}

		return sum == num;

	}

}
