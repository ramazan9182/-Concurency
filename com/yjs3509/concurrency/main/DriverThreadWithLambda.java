package com.yjs3509.concurrency.main;

public class DriverThreadWithLambda {

	
	public static void main(String[] args) {
		
		
		// run method
		Runnable runnable = () -> { 
			System.out.println("Runnuable is running"); 
		};
		
		new Thread(runnable).start();
		
		System.out.println("Main Thread is running ...");
		
	}
}
