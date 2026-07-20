package com.practice;

public class PalindromeCheck {
	
	int number;
	public PalindromeCheck(int number) {
		// TODO Auto-generated constructor stub
		this.number = number;
	}
	
	public void checkPalindrome() {
		
		int temp = number;
		int rev = 0;
		
		while(temp != 0) {
			int rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if (number == rev) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}

}
