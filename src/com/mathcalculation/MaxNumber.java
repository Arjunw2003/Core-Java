package com.mathcalculation;


public class MaxNumber {
	
	public int findMax(int a, int b, int c) {
		
		if (a >= b && b >= c) {
			System.out.println("Max No is = "+ a);
			return a;
		}else if (b >= a && b >= c) {
			System.out.println("Max No is = "+ b);
			return b;
		}else {
			System.out.println("Max No is = "+ c);
			return c;
		}
	}

}
