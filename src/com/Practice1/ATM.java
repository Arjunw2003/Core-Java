package com.Practice1;

public class ATM {
	
	double ballance = 2000;
	
	public void checkBallance() {
		
		System.out.println("Your Ballance Is: "+ballance);
		
	}
	public void withdrawAmount(double amount) {
		
		if(amount <= ballance) {
			
			ballance = ballance-amount;
			
			System.out.println("Withdraw Your Amount: "+ amount);
			System.out.println("Remaining Ballance is: "+ ballance);
			
		}else {
			System.out.println("Ins Ballance");
		}
		
		
	}

}
