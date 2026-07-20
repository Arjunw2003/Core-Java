package com.practice;

import java.util.Scanner;

public class CheckPalindromeMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number: ");
		int number = sc.nextInt();
		
		PalindromeCheck p = new PalindromeCheck(number);
		p.checkPalindrome();
	}

}
