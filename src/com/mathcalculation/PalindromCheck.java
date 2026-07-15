package com.mathcalculation;

public class PalindromCheck {
	
	public void isPalindrome(int num) {
		
		int original = num;
		int reverse = 0;
		
		while (num > 0) {
			int rem = num % 10;
			reverse = reverse * 10 + rem;
			num = num/10;
			
		}
		
		if (original == reverse) {
			System.out.println(original+ " Is Palindrome Number");
		}else {
			System.out.println(original+ " Is Not Palindrome Number");
		}
	}

}
