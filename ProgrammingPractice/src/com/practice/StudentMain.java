package com.practice;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter Marks: ");
		int marks = sc.nextInt();
		
		Student s = new Student(name, marks);
		s.display();
	}
}
