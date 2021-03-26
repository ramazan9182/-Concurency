package com.yjs3509.concurrency.callable.domain;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class TaskB implements Callable<Integer>{

	
	@Override
	public Integer call() throws Exception {
		System.out.println("Call method is running...");
		TimeUnit.SECONDS.sleep(3); // JAVA SE 6
		return (int)(Math.random() * 100);
	}

	
}
