package com.capgemini.training.lab4.exercise1.service;

/**
 * @author Komal Patil
 * The Class SavingAccount.
 */
public class SavingAccount extends Account {

	/**
	 * Instantiates a new saving account.
	 *
	 * @param name the name
	 * @param age the age
	 * @param accNum the account number
	 * @param balance the balance
	 */
	public SavingAccount(String name, float age, long accNum, double balance) {
		super(name, age, accNum, balance);
	}

	private final double minBalance = 1000;

	/**
	 * Withdraws the given amount with minimum balance 1000 kept.
	 *
	 * @param bal the amount to withdraw
	 */
	@Override
	public void withdraw(double bal) {

		if ((super.getBalance() - bal) < this.minBalance)
			System.out.println("Sorry !! Minimun balance should be INR 1000");
		else
			super.setBalance(super.getBalance() - bal);
	}

}
