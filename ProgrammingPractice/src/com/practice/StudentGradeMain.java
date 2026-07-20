package com.practice;

import java.util.Scanner;

public class StudentGradeMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Marks: ");
		int marks = sc.nextInt();
		
		StudentGrade sg = new StudentGrade(marks);
		System.out.println("Grade: "+sg.grade());
	}
}
