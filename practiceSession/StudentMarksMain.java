package com.practiceSession;

import java.util.Scanner;

public class StudentMarksMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter Marks: ");
		int marks = sc.nextInt();
		
		StudentMarks s = new StudentMarks();
		s.setName(name);
		s.setMarks(marks);
		System.out.println("Name: "+s.getName());
		s.marks(marks);
	}

}
