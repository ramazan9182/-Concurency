package com.yjs3509.concurrency.domain;

public class TaskA implements Runnable{
	
	@Override
	public void run() {
		System.out.println("TaskA is running... ");
		while(true) continue;
//		System.out.println("TaskA is done !");
		
	}

}
