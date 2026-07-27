package com.practiceSession;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter m1 Marks: ");
		int m1 = sc.nextInt();
		
		System.out.print("Enter m2 Marks: ");
		int m2 = sc.nextInt();
		
		System.out.print("Enter m3 Marks: ");
		int m3 = sc.nextInt();
		
		Student s = new Student();
		s.CalculateAvg(m1, m2, m3);
	}
}
