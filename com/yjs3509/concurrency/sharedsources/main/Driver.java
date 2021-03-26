package com.yjs3509.concurrency.sharedsources.main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.yjs3509.concurrency.sharedsources.domain.Account;
import com.yjs3509.concurrency.sharedsources.task.DepositTask;

public class Driver {

	
	public static void main(String[] args) {
		
		Account account = new Account(100);
		ExecutorService service = Executors.newCachedThreadPool();
		
		for(int i = 0; i < 1000; i++) {
			service.execute(new DepositTask(account));
		}
		
		service.shutdown();
		
		while(!service.isTerminated()) {
		// TODO : 	
		}
		
		System.out.println("Current Balance Value : " + account.getBalance());
		
		
	}
}
