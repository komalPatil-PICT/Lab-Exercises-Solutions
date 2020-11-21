package com.capgemini.training.lab4.exercise1.service;

/**
 * @author Komal Patil
 * The Class CurrentAccount.
 */

public class CurrentAccount extends Account {

	/** The overdraft limit. */
	private double overdraftLimit;

	/**
	 * Instantiates a new current account.
	 *
	 * @param name the name
	 * @param age the age
	 * @param accNum the account number
	 * @param balance the balance
	 * @param overdraftLimit the overdraft limit
	 */
	public CurrentAccount(String name, float age, long accNum, double balance,
			double overdraftLimit) {
		super(name, age, accNum, balance);
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public String toString() {

		return super.toString() + " CurrentAccount [overdraftLimit="
				+ overdraftLimit + "]";
	}

	/**
	 * Withdraws the given amount after checking if the overdraft limit is reached.
	 *
	 * @param bal the amount to withdraw
	 */
	@Override
	public void withdraw(double bal) {

		double overBalance = super.getBalance() + this.overdraftLimit;

		if ((overBalance - bal) < 0) {
			System.out.println("Overdraft limit reached !!!");
		} else {
			if (super.getBalance() < bal) {
				super.setBalance(0);
				this.overdraftLimit = overBalance - bal;
			} else {
				super.setBalance(super.getBalance() - bal);
			}
		}

	}
}
