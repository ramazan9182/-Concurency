package com.yjs3509.concurrency.priority.domain;

import java.util.concurrent.TimeUnit;

public class TaskE extends Task{
	
	
	
	public TaskE(int count) {
		this.count = count;
	}
	
	public void printStatus() {
		System.out.println(Thread.currentThread() + " :: Task E (" + getId() + ") -> " + count);
	}
	
	@Override
	public void run() {
		System.out.println("Task E started with id " + getId());
		setTaskPriority(Thread.MAX_PRIORITY);
		try {
			while(count-- > 0) {
				printStatus();
			}
			TimeUnit.SECONDS.sleep(2);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}
