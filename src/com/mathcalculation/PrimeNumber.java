package com.mathcalculation;


public class PrimeNumber {
	
	public boolean isPrime(int num) {
		
		if (num <=1) {
			System.out.println(num+" Is not Prime Number");
			return false;
		}
		
		for(int i = 2; i < num; i++) {
			if(num % i ==0) {
				System.out.println(num+" Is not Prime Number");
				return false;
			}
		}
		System.out.println(num+" Is Prime Number");
		return true;
	}

}
