package com.yjs3509.concurrency.executors.main;

import com.yjs3509.concurrency.executors.domain.TaskA;

public class DriverAsyncResult {

	
	public static void main(String[] args) {
		
		TaskA task = new TaskA();
		new Thread(task).start();
		System.out.println("Result " +  task.getResult().getData());
	}
}
