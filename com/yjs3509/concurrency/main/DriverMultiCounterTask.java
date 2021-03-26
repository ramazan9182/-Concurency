package com.yjs3509.concurrency.main;

import com.yjs3509.concurrency.domain.CounterTask;

public class DriverMultiCounterTask {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			new Thread(new CounterTask()).start();
		}
		
		System.out.println("Main method continue....");

	}
}
