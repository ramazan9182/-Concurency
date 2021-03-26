package com.yjs3509.concurrency.exception.domain;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class TaskC implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		System.out.println("Process running...");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("Continue..");
		int result = (int) (Math.random() * 1000) / 0;
		System.out.println(result);
		return result;

	}

}
