package com.practiceSession;

public class AdditionMain {

	public static void main(String[] args) {

		Addition obj = new Addition();

		System.out.println("Addition = " + obj.add(10, 20));

		System.out.println("Addition = " + obj.add(10, 20, 30));

		System.out.println("Addition = " + obj.add(10.5, 20.7));
	}
}
