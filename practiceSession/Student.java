package com.practiceSession;

public class Student {
	
	public void CalculateAvg(int m1, int m2, int m3) {

		double avg = ((m1+m2+m3)*100)/300;
		if (avg > 75) {
			System.out.println("Grade A");
		}else if (avg > 60) {
			System.out.println("Grade B");
		}else if (avg > 40) {
			System.out.println("Grade C");
		}else {
			System.out.println("Fail");
		}
	}

}
