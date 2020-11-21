package com.capgemini.training.lab4.exercise1.service;


/**
 * @author Komal Patil
 * 
 * Base class Account for classes CurrentAccount and SavingAccount.
 */

public class Account {
	private long accNum;
	private double balance;
	private Person accHolder;

	/**
	 * Instantiates a new account.
	 *
	 * @param name the name
	 * @param age the age
	 * @param accNum the account number
	 * @param balance the balance
	 */
	public Account(String name, float age, long accNum, double balance) {
		this.accNum = accNum;
		this.balance = balance;
		Person p = new Person(name, age);
		accHolder = p;
	}

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * Deposits the given amount.
	 *
	 * @param bal the amount to deposit
	 */
	public void deposit(double bal) {
		this.balance += bal;
	}

	/**
	 * Withdraws the given amount with minimum balance 500 kept.
	 *
	 * @param bal the amount to withdraw
	 */
	public void withdraw(double bal) {
		if ((this.balance - bal) < 500)
			System.out.println("Sorry !! Minimun balance should be INR 500");
		else
			this.balance -= bal;
	}

	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance
				+ ", accHolder=" + accHolder + "]";
	}

}
