package com.jbk;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DesirizableMain {

	public static void main(String[] args) throws Exception {

		FileInputStream file = new FileInputStream("D:/Core Java/FileHandling/student.txt");
		ObjectInputStream obj = new ObjectInputStream(file);

		Student std = (Student) obj.readObject();
		System.out.println("Student ID --> " + std.stdId + "\n" + "Student Name --> " + std.stdName + "\n"
				+ "Student Branch ---> " + std.stdBranch + "\n" + "Student RollNo ---> " + std.rollNo);

	}
}
