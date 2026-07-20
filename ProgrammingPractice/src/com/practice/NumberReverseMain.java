package com.practice;

import java.util.Scanner;

public class NumberReverseMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int number = sc.nextInt();
		
		NumberReverse num = new NumberReverse(number);
		num.reverse();
	}

}
