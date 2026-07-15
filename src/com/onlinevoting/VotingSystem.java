package com.onlinevoting;

public class VotingSystem {
	
	public int vote(int age) {
		if (age>=18) {
			System.out.println("Your Eligible vote");
		}else {
			System.out.println("your note Eligible vote");
		}
		return age;
		
	}

}
