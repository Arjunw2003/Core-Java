package com.mathcalculation;

import java.util.Scanner;

public class MainCalculation {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		
//		=====Method findMax(int a, int b, int c).===========

//		MaxNumber maxno = new MaxNumber();		
//		
//		System.out.print("Enter A No: ");
//		int a = sc.nextInt();
//		System.out.print("Enter B No: ");
//		int b = sc.nextInt();
//		System.out.print("Enter C No: ");
//		int c = sc.nextInt();
//		
//		maxno.findMax(a, b, c);
		
//		=======Method isPalindrome(int num)===========
		
//		PalindromCheck palid = new PalindromCheck();
//		
//		System.out.print("Enter Number: ");
//		int num = sc.nextInt();
//		
//		palid.isPalindrome(num);
		
		
//		==============Method isPrime(int num) → return true/false.
		
//		PrimeNumber prime = new PrimeNumber();
//		System.out.print("Enter Number: ");
//		int num = sc.nextInt();
//		prime.isPrime(num);
		
		
//		============Method countEvenOdd(int[] arr).
		
//		EvenOddCounter evodd = new EvenOddCounter();
//		int[] arr = {10, 13, 40, 50, 24, 43};
//		evodd.countEvenOdd(arr);
		
		System.out.print("Enter Marks: ");
		int marks = sc.nextInt();
		
		Grade grd = new Grade();
		char grade = grd.getGrade(marks);
		System.out.println("Grade: "+grade);
	}

}
