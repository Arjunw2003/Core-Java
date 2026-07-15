package com.mathcalculation;

public class Grade {
	
	public char getGrade(int marks) {
		
		if(marks >= 90) {
			return 'A';
		}else if (marks >= 75) {
			return 'B';
		}else if (marks >= 50) {
			return 'C';
		}else {
			return 'D';
		}
	}

}
