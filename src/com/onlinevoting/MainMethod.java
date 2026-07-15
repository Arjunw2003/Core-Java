package com.onlinevoting;

import java.util.Scanner;

public class MainMethod {
	
	public static void main(String[] args) {
		
		VotingSystem vts = new VotingSystem();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Age: ");
		int age = sc.nextInt();
		vts.vote(age);
	}

}
