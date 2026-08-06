package com.practice;

public interface Transaction {

	abstract void deposit(double amount);

	abstract void withdraw(double amount);

}
