package com.yjs3509.concurrency.sharedsources.task;

import com.yjs3509.concurrency.sharedsources.domain.Account;

public class DepositTask implements Runnable{
		
	private Account account;
	
	public DepositTask(Account account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		account.deposit(2);
	}

}
