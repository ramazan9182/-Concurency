package com.yjs3509.concurrency.priority.domain;

import java.util.concurrent.TimeUnit;

public class TaskF extends Task {
	
	public TaskF(int count) {
		this.count = count;
	}
	
	public void printStatus() {
		System.out.println(Thread.currentThread() + " :: Task F (" + getId() + ") -> " + count);
	}
	
	
	@Override
	public void run() {
		System.out.println("Task F started with id " + getId());
//		setTaskPriority(Thread.MIN_PRIORITY);
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
