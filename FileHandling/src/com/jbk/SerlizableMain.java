package com.jbk;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerlizableMain{

	public static void main(String[] args) throws Exception {
		
		Student s = new Student(124, "Arjun", "IT", 45);
		
		FileOutputStream file = new FileOutputStream("D:/Core Java/FileHandling/student.txt");
		ObjectOutputStream obj = new ObjectOutputStream(file);
		
		obj.writeObject(s);
		System.out.println("File Generate Successfully....");
		
		file.close();
		obj.close();
	}
}
