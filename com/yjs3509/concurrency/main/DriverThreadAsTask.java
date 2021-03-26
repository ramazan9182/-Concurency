package com.yjs3509.concurrency.main;

import com.yjs3509.concurrency.domain.ThreadTask;

public class DriverThreadAsTask {

	
	public static void main(String[] args) {
		
//		Thread thread = new Thread();
		
		ThreadTask threadTask = new ThreadTask();
		threadTask.start();
		
		System.out.println("Main method is running");
		
	}
}
