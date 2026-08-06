package com.bank;

public interface Transaction {

	public static final String bankName = "IPPB";

	public abstract void deposit(double amount);

	public abstract void withdraw(double amount);
}