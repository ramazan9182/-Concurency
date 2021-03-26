package com.yjs3509.concurrency.main;

import com.yjs3509.concurrency.domain.TaskA;

public class Driver {

	public static void main(String[] args) {
		
		TaskA taskA = new TaskA();
//		taskA.run();
//		
		Thread  thread = new Thread(taskA);
		thread.start();
		
		
		
		System.out.println("Main end !");
		
	}

}
