package com.practice;

import java.util.Scanner;

public class RecatngleMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Length: ");
		int lenght = sc.nextInt();
		
		System.out.print("Enter Breadth: ");
		int breadth = sc.nextInt();
		
		Rectangle r = new Rectangle(lenght, breadth);
		r.calculate();
		
	}

}
