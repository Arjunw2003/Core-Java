package com.bank;

public abstract class User implements Transaction {

	private String userName;
	private long accountNo;
	private double balance;

	public User(String userName, long accountNo, double balance) {
		this.userName = userName;
		this.accountNo = accountNo;
		this.balance = balance;
		// TODO Auto-generated constructor stub
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void userDetails() {
		System.out.println("User Name : " + userName);
		System.out.println("Bank Name : " + bankName);
		System.out.println("Account No : " + accountNo);
		System.out.println("Balance : " + balance);
	}

	public void checkBalance() {
		System.out.println("Available Balance: " + balance);
	}

	public abstract void transfer(double amount);

}
