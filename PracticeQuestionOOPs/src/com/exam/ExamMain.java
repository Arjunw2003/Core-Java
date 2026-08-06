package com.exam;

import java.util.Scanner;

public class ExamMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("===== ONLINE EXAM SYSTEM =====");
		System.out.println("1. Student");
		System.out.println("2. Admin");
		System.out.print("Enter Choice : ");
		int choice = sc.nextInt();

		switch (choice) {

		case 1:

			System.out.print("Enter Student Name : ");
			sc.nextLine();
			String stdName = sc.nextLine();

			System.out.print("Enter Marks : ");
			int marks = sc.nextInt();

			User u;

			u = new Student(stdName, marks);

			u.studentDetails();
			u.StartExam();
			u.endExam();
			u.calculateResult();

			break;

		case 2:

			System.out.print("Enter Student Name : ");
			sc.nextLine();
			String stdName1 = sc.nextLine();

			System.out.print("Enter Marks : ");
			int marks1 = sc.nextInt();

			u = new Admin(stdName1, marks1);

			u.studentDetails();
			u.StartExam();
			u.endExam();
			u.calculateResult();

			break;

		default:
			System.out.println("Invalid Choice");
		}

	}
}
