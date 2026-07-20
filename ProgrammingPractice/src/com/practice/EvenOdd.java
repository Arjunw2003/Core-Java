package com.practice;

public class EvenOdd {
	
	int num;
	public EvenOdd(int num) {
		// TODO Auto-generated constructor stub
		this.num = num;
	}
	public void cehck() {
		
		if (num % 2 == 0) {
		
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}
	

}
