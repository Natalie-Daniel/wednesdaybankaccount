package com.acme.financial;

public class BankAccount {
	// if we use double we need to worry about round-off error
	// many people use BigDecimal for monetary values
	private int balance;
	private int AccountNumber;

	
	public BankAccount(int startingBalance) {
		this.balance = startingBalance;
	}
	
	public void deposit(int amount) {
		this.balance += amount;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void withdraw(int amount) {
		// TODO
	}
	
	public void transfer(int amount, BankAccount other) {
		this.withdraw(amount);
		other.deposit(amount);
		
}
