package com.yjs3509.concurrency.main;

import com.yjs3509.concurrency.domain.CounterTask;

public class DriverCounterTask {

	
	public static void main(String[] args) {
		
		Thread thread = new Thread(new CounterTask());
		thread.start();
		
		System.out.println("Main method continue...");
		
	}
}
