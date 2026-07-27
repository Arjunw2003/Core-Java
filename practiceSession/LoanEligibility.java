package com.practiceSession;

public class LoanEligibility {

	public void checkLoan(double salary, int age) {

		if (salary > 25000 && age >= 21 && age <= 60) {
			System.out.println("Eligible for Loan");
		} else {
			System.out.println("Not Eligible for Loan");
		}

	}

}
