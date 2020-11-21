package com.capgemini.training.lab4.exercise1.client;

import com.capgemini.training.lab4.exercise1.service.Account;
import com.capgemini.training.lab4.exercise1.service.CurrentAccount;
import com.capgemini.training.lab4.exercise1.service.SavingAccount;

/**
 * @author Komal Patil
 * The AccountTester class.
 */

public class AccountTester {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		Account A = new Account("Smith",30,45756987,2000);
		System.out.println(A);
		A.deposit(2000);
		System.out.println(A);
		
		Account B = new Account("Kathy",35,45896988,3000);
		System.out.println(B);
		B.withdraw(2000);
		System.out.println(B);
		
		SavingAccount savAcc = new SavingAccount("komal", 22, 789845, 5000);
		System.out.println(savAcc);
		savAcc.withdraw(4001);
		System.out.println(savAcc);
		
		CurrentAccount curAcc = new CurrentAccount("komal", 22, 789845, 5000, 2000);
		System.out.println(curAcc);
		curAcc.withdraw(7002);
		System.out.println(curAcc);
		curAcc.deposit(1000);
		System.out.println(curAcc);
		curAcc.withdraw(6500);
		System.out.println(curAcc);
	}

}
