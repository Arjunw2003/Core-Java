package com.practiceSession;

import java.util.Scanner;

public class LoanEligibilityMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        
        LoanEligibility loan = new LoanEligibility();
        loan.checkLoan(salary, age);
        
        
	}

}
