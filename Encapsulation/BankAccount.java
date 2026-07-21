package Encapsulation;

public class BankAccount {

	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Amount Deposit Successfully");
		System.out.println("Current Balance: " + balance);
	}

	public void withdraw(double amount) {
		if (amount <= balance) {
			balance = balance - amount;
			System.out.println("Amount Withdraw Successfully: " + amount);
			System.out.println("Available Ballance: " + balance);
		} else {
			System.out.println("Insufficient Balance!");
		}
	}
}
