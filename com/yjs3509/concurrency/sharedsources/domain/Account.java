package com.yjs3509.concurrency.sharedsources.domain;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Account {

//	private ArrayList<Integer> requestedDeposits = new ArrayList<Integer>();

	private int balance;

	public Account(int initialBalance) {
//		requestedDeposits.add(initialBalance);
		this.balance = initialBalance;
	}

	public int getBalance() {
//		int newBalance = 0;
//		for (Integer amount : requestedDeposits) {
//			newBalance += amount;
//		}
		return balance;
	}
	
	/**
	 * synchronized method block
	 * @param amount
	 */

	public synchronized void deposit(int amount) {
//		int newBalance = balance + amount;

//		try {
//			TimeUnit.SECONDS.sleep(1);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		requestedDeposits.add(amount);
		
		balance += amount;

		/**
		 * // Race Condition iload bcode0 bcode1 bcode2 . . bcoden
		 */

//		balance = newBalance;
	}
	
	
	/**
	 * synchronized block
	 * @param amount
	 */
	
//	public void deposit(int amount) {
//
//		synchronized (this) {
//			balance += amount;
//		}
//	}
}
