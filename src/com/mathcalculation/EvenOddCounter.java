package com.mathcalculation;

public class EvenOddCounter {
	
	public void countEvenOdd(int[] arr) {
		
		int even = 0;
		int odd = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				even++;
			}else {
				odd++;
			}
		}
		
		System.out.println("Even Numbers = "+even);
		System.out.println("Odd Numbers = "+odd);
	}
}
