package com.polymorphism;

public class StudentMain {

	public static void main(String[] args) {

		Student s = new Student();
		Student s1 = new Student(12);
		Student s2 = new Student(13, "Arjun");

		s.display();
		s1.display();
		s2.display();

	}
}
